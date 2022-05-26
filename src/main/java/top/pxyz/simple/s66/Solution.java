package top.pxyz.simple.s66;

import java.util.Arrays;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1, 2, 3})));
    }

    public int[] plusOne(int[] digits) {
        boolean flag = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            int n = digits[i];
            if(i == digits.length - 1){
                if(n == 9){
                    digits[i] = 0;
                    flag = true;
                }else{
                    flag = false;
                    digits[i] = n + 1;
                }
            }else if(flag){
                if(n == 9){
                    digits[i] = 0;
                }else{
                    digits[i] = n + 1;
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            int[] r = new int[digits.length + 1];
            r[0] = 1;
            System.arraycopy(digits, 0, r, 1, r.length - 1);
            digits = r;
        }
        return digits;
    }
}
