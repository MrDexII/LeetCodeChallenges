package Tree;

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return util(nums, 0, nums.length - 1);
    }

    public TreeNode util(int nums[], int l, int r) {
        if (l <= r) {
            int mid = l + (r - l)/2;

            TreeNode root = new TreeNode(nums[mid]);
            root.left = util(nums, l, mid-1);
            root.right = util(nums, mid+1, r);
            return root;
        }
        return null;
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();

        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode treeNode = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);
    }
}
