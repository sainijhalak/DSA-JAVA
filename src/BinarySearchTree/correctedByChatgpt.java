package BinarySearchTree;

public class correctedByChatgpt {
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

    static int deleteNodeWith2Child(Node root){
        if(root.right==null) return root.val;
        return deleteNodeWith2Child(root.right);
    }

    static Node delete(Node root,int t){
        if(root==null) return null;

        if(t<root.val){
            if(root.left!=null && root.left.val==t){
                if(root.left.left==null && root.left.right==null)
                    root.left=null;

                else if(root.left.left==null || root.left.right==null){
                    if(root.left.left!=null) root.left=root.left.left;
                    else if(root.left.right!=null) root.left=root.left.right;
                }

                else{
                    int ans=deleteNodeWith2Child(root.left);
                    root.left.val=ans;
                    root.left=delete(root.left,ans);
                }
            }
            else {
                root.left=delete(root.left, t);
            }
        }

        else if(t>root.val){
            if(root.right!=null && root.right.val==t){
                if(root.right.left==null && root.right.right==null)
                    root.right=null;

                else if(root.right.left==null || root.right.right==null) {
                    if(root.right.left!=null) {
                        root.right = root.right.left;
                    }
                    else if(root.right.right!=null) root.right=root.right.right;
                }

                else{
                    int ans=deleteNodeWith2Child(root.right);
                    root.right.val=ans;
                    root.right=delete(root.right,ans);
                }
            }
            else{
                root.right=delete(root.right, t);
            }
        }

        else { // root delete case
            if(root.left==null && root.right==null) return null;

            else if(root.left==null) return root.right;

            else if(root.right==null) return root.left;

            else{
                int ans=deleteNodeWith2Child(root.left);
                root.val=ans;
                root.left=delete(root.left,ans);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[]arr={34,5,2,4,72,44,17};
        Node root=null;

        for(int i=0;i<arr.length;i++){
            root=create(root,arr[i]);
        }

        System.out.println("before");
        inorder(root);

        int target=34;
        root=delete(root,target);

        System.out.println("after");
        inorder(root);
    }
}