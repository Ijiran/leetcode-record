package top.pxyz.simple.s575;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distributeCandies(new int[]{1,1,2,3}));
        System.out.println(solution.distributeCandies(new int[]{1,4,2,3}));
    }

    /**
     *
     *
     * @param candyType
     * @return
     */
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int n : candyType){
            set.add(n);
        }
        return Math.min(set.size(), candyType.length / 2);
    }

}
