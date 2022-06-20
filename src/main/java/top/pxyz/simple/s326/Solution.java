package top.pxyz.simple.s326;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(27));
        System.out.println(solution.isPowerOfFour(64));
    }

    public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        while (n != 1){
            if(n % 3 != 0){
                return false;
            }
            n = n / 3;
        }
        return true;
    }

    public boolean isPowerOfFour(int n) {
        if(n == 0){
            return false;
        }
        while (n != 1){
            if(n % 4 != 0){
                return false;
            }
            n = n / 4;
        }
        return true;
    }

}
