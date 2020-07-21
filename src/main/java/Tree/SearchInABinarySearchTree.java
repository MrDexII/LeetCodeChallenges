package Tree;

import java.util.Stack;

public class SearchInABinarySearchTree {
    TreeNode node;

    public TreeNode searchBSTReq(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        else if (root.left != null) return searchBSTReq(root.left, val);
        else return searchBSTReq(root.right, val);
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            if (node.val == val) return node;
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return null;
    }

    public static void main(String[] args) {
        SearchInABinarySearchTree searchInABinarySearchTree = new SearchInABinarySearchTree();

        TreeNode node = new TreeNode();

        TreeNode root = new TreeNode(
                4, new TreeNode(
                2, new TreeNode(
                1, null, null), new TreeNode(
                3, null, null)), new TreeNode(
                7, null, null));
        int val = 7;

        TreeNode result = searchInABinarySearchTree.searchBSTReq(root, val);
    }
}
