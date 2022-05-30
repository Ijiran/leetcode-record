package top.pxyz.simple.s101;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        return is(left, right);
    }

    private boolean is(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }else if(left == null || right == null){
            return false;
        }

        if(left.val != right.val){
            return false;
        }else{
            return is(left.left, right.right) && is(left.right, right.left);
        }

    }

}
