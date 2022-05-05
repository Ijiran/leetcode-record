package top.pxyz.medium.m713;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num < k){
                count++;
                int j = 1;
                while (j < nums.length - i){
                    num = num * nums[i + j];
                    if(num < k){
                        count++;
                        j++;
                    }else{
                        break;
                    }
                }
            }
        }
        return count;
    }

}
