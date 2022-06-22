package top.pxyz.simple.s367;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPerfectSquare(16));
    }

    public boolean isPerfectSquare(int num) {
        long x = 1, z = 1;
        while (z <= num) {
            if (z == num) {
                return true;
            }
            ++x;
            z = x * x;
        }
        return false;
    }

}
