package BinarySearchTree;

class Node2 {
    int val;
    Node2 left, right;

    Node2(int val) {
        this.val = val;
    }
}

public class raghavsirdeletion {

    // INSERT
    static Node2 insert(Node2 root, int val) {
        if (root == null) return new Node2(val);

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // PREORDER
    static void preorder(Node2 root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // DELETE (ONLY LEAF - VOID STYLE)
    static void delete(Node2 root, int target) {
        if (root == null) return;

        if (target < root.val) {
            // check left child
            if (root.left != null && root.left.val == target) {
                if (root.left.left == null && root.left.right == null) {
                    root.left = null; // delete leaf
                }
            } else {
                delete(root.left, target);
            }
        }
        else if (target > root.val) {
            // check right child
            if (root.right != null && root.right.val == target) {
                if (root.right.left == null && root.right.right == null) {
                    root.right = null; // delete leaf
                }
            } else {
                delete(root.right, target);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {50, 20, 60, 17, 34, 55, 89, 10};

        Node2 root = null;
        for (int x : arr) {
            root = insert(root, x);
        }

        System.out.print("Before delete: ");
        preorder(root);

        delete(root, 10); // leaf delete

        System.out.print("\nAfter delete: ");
        preorder(root);
    }
}
