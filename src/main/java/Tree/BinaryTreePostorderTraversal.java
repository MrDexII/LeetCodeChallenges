package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversalReq(TreeNode root) {
        if (root == null) return list;
        postorderTraversalReq(root.left);
        postorderTraversalReq(root.right);
        list.add(root.val);
        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root, lastVisited = null;
        while (curr != null || !stack.empty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.peek();
            if (curr.right == null || curr.right == lastVisited) {
                list.add(curr.val);
                stack.pop();
                lastVisited = curr;
                curr = null;
            } else {
                curr = curr.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        BinaryTreePostorderTraversal binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();

        TreeNode root = new TreeNode(
                1, null, new TreeNode(
                2, new TreeNode(
                3, null, null), null));

        System.out.println(binaryTreePostorderTraversal.postorderTraversal(root).toString());
    }
}
