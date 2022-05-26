package top.pxyz.simple.s58;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World"));
    }

    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }
}
