package top.pxyz.simple.s905;

import java.util.Arrays;

/**
 * 按奇偶排序数组
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(solution.sortArrayByParity(nums)));
    }

    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        //声明首尾索引值
        int l = 0, r = nums.length - 1;
        for (int n : nums){
            if(n % 2 == 0){
                result[l] = n;
                l++;
            }else{
                result[r] = n;
                r--;
            }
        }
        return result;
    }

}
