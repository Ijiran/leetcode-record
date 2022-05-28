package top.pxyz.simple.s69;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(4));
        System.out.println(solution.mySqrt(8));
    }

    public int mySqrt(int x) {
        int l = 0, r = x, result = -1;
        while (l <= r) {
            int z = l + (r - l) / 2;
            if ((long) z * z <= x) {
                result = z;
                l = z + 1;
            } else {
                r = z - 1;
            }
        }
        return result;
    }

}
