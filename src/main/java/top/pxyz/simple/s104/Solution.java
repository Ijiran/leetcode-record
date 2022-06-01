package top.pxyz.simple.s104;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return Math.max(l, r) + 1;
        }
    }

}
