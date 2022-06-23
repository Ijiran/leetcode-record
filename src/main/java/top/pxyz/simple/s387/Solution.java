package top.pxyz.simple.s387;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("aabb"));
        System.out.println(solution.firstUniqChar("abcdef"));
        System.out.println(solution.firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.lastIndexOf(s.charAt(i)));
            if(s.lastIndexOf(s.charAt(i)) == i && s.indexOf(s.charAt(i)) == i){
                return i;
            }
        }
        return -1;
    }

}
