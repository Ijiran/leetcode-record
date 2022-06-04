package top.pxyz.simple.s168;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(19));
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            //转成char
            char s = (char) (columnNumber % 26 + 'A');
            sb.append(s);
            columnNumber /= 26;
        }
        sb.reverse();
        return sb.toString();
    }
}
