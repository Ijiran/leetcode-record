package top.pxyz.simple.s111;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Integer.MAX_VALUE);
//        System.out.println(solution.minDepth(null));
    }

    public int minDepth(TreeNode root) {
        //为空为0
        if (root == null) {
            return 0;
        }
        //有一侧为空直接输出1
        if (root.left == null && root.right == null) {
            return 1;
        }
        int z = 10001;
        if (root.left != null) {
            z = Math.min(minDepth(root.left), z);
        }
        if (root.right != null) {
            z = Math.min(minDepth(root.right), z);
        }
        return z + 1;
    }

}
