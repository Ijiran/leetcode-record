package top.pxyz.simple.s389;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTheDifference("a", "ac"));
    }

    public char findTheDifference(String s, String t) {
        int a = 0, b = 0;
        for (int i = 0; i < s.length(); ++i) {
            a += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            b += t.charAt(i);
        }
        return (char) (b - a);
    }

}
