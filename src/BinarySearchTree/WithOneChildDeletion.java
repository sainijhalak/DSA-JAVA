package BinarySearchTree;

public class WithOneChildDeletion {
    public static class Node{
        Node left;
        Node right;
        int val;
        Node(int val){
            this.val=val;
        }
    }
    static Node create(Node root, int val){
        if(root==null) return new Node(val);
        if(val<root.val){
            root.left=create(root.left,val);
        }
        else if (val>root.val) {
            root.right=create(root.right,val);
        }
        return root;
    }
    static void inorder(Node root){
        if(root==null) return ;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    static void delete(Node root,int t){
        if(root==null) return;
        if(t<root.val){
            if(root.left!=null && root.left.val==t){
                if(root.left.left==null && root.left.right==null)
                    root.left=null;
                else {
                    if(root.left.left!=null) root.left=root.left.left;
                    else if(root.left.right!=null) root.left=root.left.right;
                }

            }

            else {
                delete(root.left, t);
            }
        }
        else if(t>root.val){
            if(root.right!=null && root.right.val==t){
                if(root.right.left==null && root.right.right==null)
                root.right=null;
                else {
                    if(root.right.left!=null) {
                        root.right = root.right.left;
                    }
                    else if(root.right.right!=null) root.right=root.right.right;
                }
            }
            else{
                delete(root.right, t);
            }
        }
    }
     static void deleteWithOneChild(Node root,int t){
        if(root==null) return;
        if(t<root.val){
            if(root.left!=null && root.left.val==t){
                if(root.left.left!=null) root.left=root.left.left;
                else if(root.left.right!=null) root.left=root.left.right;
            }
            else{
                deleteWithOneChild(root.left,t);
            }
        }
         else if (t>root.val){
             if(root.right!=null && root.right.val==t){
                 if(root.right.left!=null) {
                     root.right = root.right.left;
                 }
                 else if(root.right.right!=null) root.right=root.right.right;
             }
             else{
                 deleteWithOneChild(root.right,t);
             }
         }

     }
    public static void main(String[] args) {
        int[]arr={34,5,2,4,72,44,17};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=create(root,arr[i]);
        }
        System.out.println("before");
        inorder(root);
        int target=2;
        delete(root,target);
//        deleteWithOneChild(root,target);
        System.out.println("after");
        inorder(root);
    }
}
