package top.pxyz.simple.s125;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome(".,"));
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase(Locale.ROOT);
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        if(list.size() == 0){
            return true;
        }
        int l = 0, r = list.size() - 1;
        while (l < r){
            char lc = list.get(l);
            char rc = list.get(r);
            if(lc != rc){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
