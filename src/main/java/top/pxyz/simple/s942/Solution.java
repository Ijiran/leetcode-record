package top.pxyz.simple.s942;

import java.util.Arrays;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.diStringMatch("IDID")));
        System.out.println(Arrays.toString(solution.diStringMatch("III")));
        System.out.println(Arrays.toString(solution.diStringMatch("DDI")));
    }

    public int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int min = 0, max = s.length();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'D'){
                result[i] = max;
                max--;
            }else{
                result[i] = min;
                min++;
            }
        }
        result[s.length()] = min;
        return result;
    }

}
