package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public boolean isSymmetricReq(TreeNode root) {
        return isSame(root, root);
    }

    private boolean isSame(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) return true;
        if (r1 == null || r2 == null) return false;
        return (r1.val == r2.val)
                && isSame(r1.right, r2.left)
                && isSame(r1.left, r2.right);

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode r1 = queue.poll();
            TreeNode r2 = queue.poll();
            if (r1 == null && r2 == null) continue;
            if (r1 == null || r2 == null) return false;
            if (r1.val != r2.val) return false;
            queue.offer(r1.left);
            queue.offer(r2.right);
            queue.offer(r2.left);
            queue.offer(r1.right);
        }
        return true;
    }

    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();

        TreeNode root = new TreeNode(
                1, new TreeNode(
                2, new TreeNode(
                3, null, null), new TreeNode(
                4, null, null)), new TreeNode(
                2, new TreeNode(
                4, null, null), new TreeNode(
                3, null, null)));

//        TreeNode root = new TreeNode(
//                1, new TreeNode(
//                2, null, new TreeNode(
//                3, null, null)), new TreeNode(
//                2, null, new TreeNode(
//                3, null, null)));

        System.out.println(symmetricTree.isSymmetric(root));
    }
}
