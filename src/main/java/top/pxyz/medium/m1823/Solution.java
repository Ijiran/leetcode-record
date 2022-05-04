package top.pxyz.medium.m1823;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTheWinner(5, 2));
        System.out.println(solution.findTheWinner(6, 5));
        System.out.println(solution.findTheWinner(8, 8));
        System.out.println(solution.findTheWinner(1, 1));
    }

    /**
     * 1.
     * @param n
     * @param k
     * @return
     */
    public int findTheWinner(int n, int k) {
        if(n == 1){
            return 1;
        }
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (true){
            for (int j = 0; j < k; j++) {
                if(n < ++i){
                    i = i - n;
                }
                if(set.contains(i)){
                    while(set.contains(i)){
                        if(n < ++i){
                            i = i - n;
                        }
                    }
                }
            }
            set.add(i);
            if(set.size() == n - 1){
                break;
            }
        }
        int result = 1;
        for (int j = 1; j <= n; j++) {
            if(!set.contains(j)){
                result = j;
            }
        }
        return result;
    }

}
