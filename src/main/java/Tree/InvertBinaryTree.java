package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {


    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.left == null && current.right == null) continue;
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        return root;
    }

    public TreeNode invertTreeReq(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTreeReq(root.left);
        TreeNode right = invertTreeReq(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();


////                          4                   4
////                       /    \              /    \
////                     2       7           7       2
////                   /  \    /  \        /  \    /  \
////                  1    3  6    9     9     6  3    1
//        TreeNode root = new TreeNode(
//                4, new TreeNode(
//                2, new TreeNode(
//                1), new TreeNode(
//                3)), new TreeNode(
//                7, new TreeNode(
//                6), new TreeNode(
//                9)));

        //                  1             1
        //                   \          /
        //                    2        2
        //                  /           \
        //                 3             3
        TreeNode root = new TreeNode(
                1, null, new TreeNode(
                2, new TreeNode(3), null));


        invertBinaryTree.invertTree(root);
    }
}
