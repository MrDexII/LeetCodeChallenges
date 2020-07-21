package Tree;

import java.util.*;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        List<Integer> path = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> set = new HashSet<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode treeNode = stack.peek();
            if (set.add(treeNode)) {
                path.add(treeNode.val);
            }
            if (treeNode.right != null && !set.contains(treeNode.right)) {
                stack.push(treeNode.right);
            }
            if (treeNode.left != null && !set.contains(treeNode.left)) {
                stack.push(treeNode.left);
            }
            if (treeNode.left == null && treeNode.right == null) {
                int sum1 = path.stream().mapToInt(i -> i).sum();
                if (sum1 == sum) {
                    return true;
                }
                stack.pop();
                path.remove(path.size() - 1);
            }
            if (set.contains(treeNode.left) || set.contains(treeNode.right)) {
                stack.pop();
                path.remove(path.size() - 1);
            }

        }
        return false;
    }

    public boolean hasPathSumReq(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return sum == root.val;
        return (hasPathSumReq(root.left,sum - root.val) || hasPathSumReq(root.right, sum - root.val));
    }

    public boolean hasPathSum2(TreeNode root, int sum) {
        if(root == null) return false;
        Queue<TreeNode> qt = new LinkedList<>();
        Queue<Integer> qs = new LinkedList<>();
        qt.offer(root);
        qs.offer(sum);
        while(!qt.isEmpty()) {
            int size = qt.size();
            while(size != 0) {
                TreeNode node = qt.poll();
                int val = qs.poll();
                if(node.left == null && node.right == null && node.val - val == 0) return true;
                if(node.left != null) {
                    qt.offer(node.left);
                    qs.offer(val - node.val);
                }
                if(node.right != null) {
                    qt.offer(node.right);
                    qs.offer(val - node.val);
                }
                size--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PathSum pathSum = new PathSum();

        TreeNode tree = new TreeNode(
                5, new TreeNode(
                4, new TreeNode(
                11, new TreeNode(
                7, null, null), new TreeNode(
                2, null, null)), null), new TreeNode(
                8, new TreeNode(
                13, null, null), new TreeNode(
                4, null, new TreeNode(
                1, null, null))));

        int sum = 22;

        System.out.println(pathSum.hasPathSum2(tree, sum));

    }
}
