package Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ConstructBinaryTreeFromInorderAndPostOrderTraversal {

    private TreeNode construct(int start, int end,
                                     int[] postorder, AtomicInteger pIndex,
                                     Map<Integer, Integer> map) {
        if (start > end) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[pIndex.getAndDecrement()]);

        int index = map.get(root.val);

        root.right = construct(index + 1, end, postorder, pIndex, map);

        root.left = construct(start, index - 1, postorder, pIndex, map);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        AtomicInteger pIndex = new AtomicInteger(n - 1);
        return construct(0, n - 1, postorder, pIndex, map);
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromInorderAndPostOrderTraversal constructBinaryTreeFromInorderAndPostorderTraversal = new ConstructBinaryTreeFromInorderAndPostOrderTraversal();

        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        //            3
        //          /  \
        //         9   20
        //            /  \
        //          15    7
        TreeNode node = constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(inorder, postorder);

    }
}
