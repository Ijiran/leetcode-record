package top.pxyz.simple.s268;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(new int[]{3,0,1}));
    }

    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            set.add(n);
        }
        //循环
        for (int i = 0; i < nums.length + 1; i++) {
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }

}
