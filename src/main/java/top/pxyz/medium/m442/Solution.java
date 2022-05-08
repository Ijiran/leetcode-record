package top.pxyz.medium.m442;

import java.util.*;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : nums){
            if(map.get(n) != null && map.get(n) == 1){
                result.add(n);
                map.put(n, 2);
            }else{
                map.put(n, 1);
            }
        }
        return result;
    }
}
