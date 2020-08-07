package Tree;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (!helper(node.right, val, upper)) return false;
        if (!helper(node.left, lower, val)) return false;
        return true;
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

        //      2
        //    /   \
        //   1     3
        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));

        //      5
        //    /   \
        //   1     4
        //       /   \
        //      3     6
//        TreeNode root = new TreeNode(5,
//                new TreeNode(1),
//                new TreeNode(4,
//                        new TreeNode(3),
//                        new TreeNode(6)));

        //      1
        //    /
        //   1
        //TreeNode root = new TreeNode(1, new TreeNode(1), null);
        System.out.println(validateBinarySearchTree.isValidBST(root));
    }
}
