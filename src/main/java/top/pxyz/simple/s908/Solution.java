package top.pxyz.simple.s908;

import java.util.HashSet;
import java.util.Set;

/**
 * 最小差值 I
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,3,6};
        int k = 3;
        System.out.println(solution.smallestRangeI(nums, k));
    }

    public int smallestRangeI(int[] nums, int k) {
        if(nums.length == 1){
            return 0;
        }
        int result;
        int min = nums[0];
        int max = nums[0];
        //
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        //
        if(max - min <= k * 2){
            return 0;
        }else{
            result = max - min - k * 2;
        }
        return result;
    }

}
