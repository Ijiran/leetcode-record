package top.pxyz.simple.s263;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isUgly(6));
    }

    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] ints = {2, 3, 5};
        for (int i : ints) {
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }

}
