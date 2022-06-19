package top.pxyz.simple.s283;

import java.util.Arrays;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0,1,0,3,12};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                int index = i + 1;
                while (index < nums.length){
                    int n = nums[index];
                    if(n == 0){
                        index++;
                    }else{
                        nums[i] = n;
                        nums[index] = 0;
                        break;
                    }
                }
            }
        }
    }

}
