package top.pxyz.simple.s9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ijiran
 * @description: 回文数
 * @date 2022/4/27 21:53
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(1001));
        System.out.println(solution.isPalindrome2(1001));
    }

    public boolean isPalindrome2(int x) {
        if(x == 0){
            return true;
        }
        if(x < 0 || x % 10 == 0){
            return false;
        }
        int result = 0;
        int ten = getIntTen(x);
        int n = x;
        while (ten > 0){
            result = result + n % 10 * ten;
            n = n / 10;
            ten = ten / 10;
        }
        return x == result;
    }

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        List<Integer> numList = getIntList(x);
        int n = numList.size();
        int l = 1, r = 1;
        boolean flag = true;
        while(l + r <= n){
            int lz = numList.get(l-1);
            int nz = numList.get(n - r);
            if(lz != nz){
                flag = false;
                break;
            }else{
                l++;
                r++;
            }
        }
        return flag;
    }

    private List<Integer> getIntList(int x){
        List<Integer> list = new ArrayList<Integer>();
        while (x != 0){
            list.add(x % 10);
            x = x / 10;
        }
        return list;
    }

    private int getIntTen(int x){
        int n = 1;
        while (x >= 10){
            n = n * 10;
            x = x / 10;
        }
        return n;
    }

}
