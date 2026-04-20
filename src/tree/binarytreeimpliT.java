package tree;

import java.util.*;

class binarytreeimpliT  {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Scanner sc = new Scanner(System.in);

    static Node buildTree() {
        int val = sc.nextInt();

        if (val == -1) return null;

        Node root = new Node(val);

        root.left = buildTree();
        root.right = buildTree();

        return root;
    }

    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Enter nodes (-1 for NULL):");
        Node root = buildTree();

        System.out.print("Inorder: ");
        inorder(root);
    }
}