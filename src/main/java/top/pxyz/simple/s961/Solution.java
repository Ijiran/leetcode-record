package top.pxyz.simple.s961;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.repeatedNTimes(new int[]{1,2,3,3}));
    }

    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums){
            if(set.contains(a)){
                return a;
            }else{
                set.add(a);
            }
        }
        return 0;
    }

}
