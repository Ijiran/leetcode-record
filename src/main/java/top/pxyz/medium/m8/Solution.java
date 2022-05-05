package top.pxyz.medium.m8;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.myAtoi("4193 with words"));
//        System.out.println(solution.myAtoi("   -42"));
//        System.out.println(solution.myAtoi("42"));
//        System.out.println(solution.myAtoi("words and 987"));
//        System.out.println(solution.myAtoi("-91283472332"));
//        System.out.println(solution.myAtoi(".1"));
//        System.out.println(solution.myAtoi("21474836460"));
//        System.out.println(solution.myAtoi("   +0 123"));
//        System.out.println(solution.myAtoi("+-12"));
        System.out.println(solution.myAtoi("9223372036854775808"));
        System.out.println(solution.myAtoi("-9223372036854775808"));
    }

    Set<Character> set = new HashSet<Character>(){{
        add('1');
        add('2');
        add('3');
        add('4');
        add('5');
        add('6');
        add('7');
        add('8');
        add('9');
        add('0');
    }};

    public int myAtoi(String s) {
        long result = 0;
        boolean f = false;
        int w = -1;
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i)) && result < Integer.MAX_VALUE){
                int num = Integer.parseInt(s.charAt(i) + "");
                result = result * 10 + num;
                w = 1;
            }else if(w == -1 && s.charAt(i) == '-'){
                w = 0;
                f = true;
            }else if(w == -1 && s.charAt(i) == '+'){
                w = 0;
                f = false;
            }else if(w == -1 && s.charAt(i) != ' ' && !set.contains(s.charAt(i))){
                return 0;
            }else if(w != -1){
                break;
            }
        }
        if(f){
            return (int) Math.max(Integer.MIN_VALUE, -(result));
        }else {
            return (int) Math.min(Integer.MAX_VALUE, result);
        }
    }

}
