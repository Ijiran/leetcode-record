package top.pxyz.simple.s349;

import java.util.*;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersection(new int[]{1,2,2,1}, new int[]{2,2})));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                set.remove(i);
                resultList.add(i);
            }
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

}
