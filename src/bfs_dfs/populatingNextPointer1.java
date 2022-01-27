package bfs_dfs;

import leetcode_classes.Node;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/submissions/
public class populatingNextPointer1 {
    public static Node connect(Node root){
        if(root == null || root.left == null){
            return root;
        }

        root.left.next = root.right;
        if(root.next != null){
            root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);

        return root;
    }

    public static void main(String[] args){

    }
}
