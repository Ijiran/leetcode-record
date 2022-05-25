package top.pxyz.simple.s27;

import java.util.Arrays;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeElement(new int[]{3,2,2,3}, 3));
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
