package top.pxyz.simple.s110;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.a(null));
    }

    public boolean isBalanced(TreeNode root) {
        return a(root) >= 0;
    }

    public int a(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = a(root.left);
        int rightHeight = a(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
