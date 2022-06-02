package top.pxyz.simple.s108;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sortedArrayToBST(new int[]{-10,-3,0,5,9}));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return a(nums, 0, nums.length - 1);
    }

    private TreeNode a(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int z = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[z]);
        root.left = a(nums, l, z - 1);
        root.right = a(nums, z + 1, r);
        return root;
    }

}
