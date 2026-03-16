
package tree;

import java.util.LinkedList;
import java.util.Queue;

public class diameter2 {

    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public static int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int ans = 0;

    public static void diameter(Node root){
        if(root == null) return;

        int l = height(root.left);
        int r = height(root.right);

        ans = Math.max(ans, l + r);

        diameter(root.left);
        diameter(root.right);
    }

    public static void main(String[] args) {

        //[4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]
        // create this leetcode tree here

        Integer[] arr = {4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,
                null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2};

        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);

        int i = 1;

        while(!q.isEmpty() && i < arr.length){
            Node curr = q.poll();

            if(arr[i] != null){
                curr.left = new Node(arr[i]);
                q.add(curr.left);
            }
            i++;

            if(i < arr.length && arr[i] != null){
                curr.right = new Node(arr[i]);
                q.add(curr.right);
            }
            i++;
        }

        diameter(root);
        System.out.println(ans);
    }
}
