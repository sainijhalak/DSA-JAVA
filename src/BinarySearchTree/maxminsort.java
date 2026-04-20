//package BinarySearchTree;
//
//// Binary Search Tree Implementation for Practice
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int val) {
//        this.val = val;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//class BST {
//    TreeNode root;
//
//    // 1. Insert a value (recursive)
//    public TreeNode insert(TreeNode root, int val) {
//        if(root == null) {
//            return new TreeNode(val);
//        }
//
//        if(val > root.val) {
//            root.right = insert(root.right, val);
//        } else if(val < root.val) {
//            root.left = insert(root.left, val);
//        }
//        // duplicate values ignore karo
//        return root;
//    }
//
//    // 2. Search a value (recursive)
//    public boolean search(TreeNode root, int val) {
//        if(root == null) {
//            return false;
//        }
//        if(root.val == val) {
//            return true;
//        }
//        if(val > root.val) {
//            return search(root.right, val);
//        } else {
//            return search(root.left, val);
//        }
//    }
//
//    // 3. Find Minimum value
//    public int findMin(TreeNode root) {
//        if(root == null) {
//            throw new RuntimeException("Tree is empty");
//        }
//        // Leftmost node
//        if(root.left == null) {
//            return root.val;
//        }
//        return findMin(root.left);
//    }
//
//    // 4. Find Maximum value (iterative way - different style)
//    public int findMax(TreeNode root) {
//        if(root == null) {
//            throw new RuntimeException("Tree is empty");
//        }
//        TreeNode current = root;
//        while(current.right != null) {
//            current = current.right;
//        }
//        return current.val;
//    }
//
//    // 5. Inorder Traversal (sorted order milega)
//    public void inorder(TreeNode root) {
//        if(root == null) {
//            return;
//        }
//        inorder(root.left);
//        System.out.print(root.val + " ");
//        inorder(root.right);
//    }
//
//    // 6. Delete a value (optional but good practice)
//    public TreeNode delete(TreeNode root, int val) {
//        if(root == null) {
//            return null;
//        }
//
//        if(val > root.val) {
//            root.right = delete(root.right, val);
//        } else if(val < root.val) {
//            root.left = delete(root.left, val);
//        } else {
//            // Node found - 3 cases
//
//            // Case 1: Leaf node
//            if(root.left == null && root.right == null) {
//                return null;
//            }
//
//            // Case 2: One child
//            if(root.left == null) {
//                return root.right;
//            }
//            if(root.right == null) {
//                return root.left;
//            }
//
//            // Case 3: Two children
//            // Find inorder successor (smallest in right subtree)
//            int minVal = findMin(root.right);
//            root.val = minVal;
//            root.right = delete(root.right, minVal);
//        }
//        return root;
//    }
//}
//
//public class maxminsort{
//    public static void main(String[] args) {
//        BST bst = new BST();
//
//        // Insert values
//        System.out.println("=== Inserting values ===");
//        int[] values = {50, 30, 70, 20, 40, 60, 80};
//        for(int val : values) {
//            bst.root = bst.insert(bst.root, val);
//            System.out.print(val + " ");
//        }
//
//        System.out.println("\n\n=== Inorder Traversal (Sorted) ===");
//        bst.inorder(bst.root);  // Output: 20 30 40 50 60 70 80
//
//        System.out.println("\n\n=== Find Min and Max ===");
//        System.out.println("Minimum value: " + bst.findMin(bst.root));  // 20
//        System.out.println("Maximum value: " + bst.findMax(bst.root));  // 80
//
//        System.out.println("\n=== Search values ===");
//        System.out.println("Search 40: " + bst.search(bst.root, 40));  // true
//        System.out.println("Search 100: " + bst.search(bst.root, 100)); // false
//
//        System.out.println("\n=== Delete 30 (has two children) ===");
//        bst.root = bst.delete(bst.root, 30);
//        System.out.print("After deletion: ");
//        bst.inorder(bst.root);  // 20 40 50 60 70 80
//
//        System.out.println("\n\n=== Delete 20 (leaf node) ===");
//        bst.root = bst.delete(bst.root, 20);
//        System.out.print("After deletion: ");
//        bst.inorder(bst.root);  // 40 50 60 70 80
//
//        System.out.println("\n\n=== Practice Challenge ===");
//        System.out.println("1. Try inserting duplicate (50) - kya hoga?");
//        System.out.println("2. Try finding min/max on empty tree - kya hoga?");
//        System.out.println("3. Delete root node (50) - tree kaise change hoga?");
//    }
//}