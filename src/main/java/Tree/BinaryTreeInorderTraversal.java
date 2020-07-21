package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversalReq(TreeNode root) {
        if (root == null) return list;
        inorderTraversalReq(root.left);
        list.add(root.val);
        inorderTraversalReq(root.right);
        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

        //                  1
        //                   \
        //                    2
        //                  /
        //                 3
        TreeNode root = new TreeNode(
                1, null, new TreeNode(
                2, new TreeNode(3), null));

        //                  1
        //               /    \
        //             2       3
        //           /  \    /
        //          4    5  6
//        TreeNode root = new TreeNode(
//                1, new TreeNode(
//                2, new TreeNode(
//                4, null, null), new TreeNode(
//                5, null, null)), new TreeNode(
//                3, new TreeNode(
//                6, null, null), null));

        System.out.println(binaryTreeInorderTraversal.inorderTraversal(root).toString());
    }
}
