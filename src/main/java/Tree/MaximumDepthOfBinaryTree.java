package Tree;

public class MaximumDepthOfBinaryTree {
    int depth = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return Math.max(left_depth, right_depth) + 1;
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        TreeNode root = new TreeNode(
                3, new TreeNode(
                9, null, null), new TreeNode(
                20, new TreeNode(
                15, null, null), new TreeNode(
                7, null, null)));

        System.out.println(maximumDepthOfBinaryTree.maxDepth(root));
    }
}
