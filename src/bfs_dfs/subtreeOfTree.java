package bfs_dfs;

import leetcode_classes.TreeNode;

// https://leetcode.com/problems/subtree-of-another-tree/
// https://www.geeksforgeeks.org/check-if-a-binary-tree-is-subtree-of-another-binary-tree/
public class subtreeOfTree {


    public static boolean isSubtree(TreeNode root, TreeNode subRoot){
        // check that subRoot is null
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }

        if(isIdentical(root,subRoot)){
            return true;
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public static boolean isIdentical(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null || t2 == null){
            return false;
        }
        return (t1.val == t2.val && isIdentical(t1.left,t2.left) && isIdentical(t1.right,t2.right));
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3,new TreeNode(4, new TreeNode(1), new TreeNode(2)),new TreeNode(5));
        TreeNode subroot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        System.out.print(isSubtree(root,subroot));
    }
}
