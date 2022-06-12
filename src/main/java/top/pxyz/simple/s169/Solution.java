package top.pxyz.simple.s169;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{3,2,3}));
    }

    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums){
            Integer count = map.get(a);
            if(count == null){
                map.put(a, 1);
            }else if(++count > n){
                return a;
            }else{
                map.put(a, count);
            }
        }
        return 0;
    }

}
