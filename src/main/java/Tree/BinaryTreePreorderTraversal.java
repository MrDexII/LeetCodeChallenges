package Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuilder tree = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                tree.append(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return tree.toString();
    }
}

public class BinaryTreePreorderTraversal {
    public static List<Integer> integerList = new ArrayList<>();

    public static List<Integer> preorderTraversalReq(TreeNode root) {
        if (root == null)
            return integerList;
        integerList.add(root.val);
        preorderTraversalReq(root.left);
        preorderTraversalReq(root.right);
        return integerList;
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return integerList;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            integerList.add(current.val);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return integerList;
    }


    public static void main(String[] args) {
//        TreeNode node = new TreeNode(
//                1, null, new TreeNode(
//                2, new TreeNode(3), null));

        TreeNode node = new TreeNode(
                5, new TreeNode(
                4, new TreeNode(
                11, new TreeNode(
                7, null, null), new TreeNode(
                2, null, null)), null), new TreeNode(
                8, new TreeNode(
                13, null, null), new TreeNode(
                4, null, new TreeNode(
                1, null, null))));

        List<Integer> integers = preorderTraversal(node);
        System.out.println(integers.toString());
    }
}
