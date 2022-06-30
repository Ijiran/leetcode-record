package top.pxyz.simple.s1556;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.thousandSeparator(1212312));
    }

    public String thousandSeparator(int n) {
            StringBuilder stringBuilder = new StringBuilder(n + "");
            int length = stringBuilder.length();
            int dianCount = length > 3 ? length / 3 : 0;
            if(dianCount > 0){
                for (int i = length - 3; i > 0; i = i - 3) {
                    stringBuilder.insert(i, ".");
                }
            }
            return stringBuilder.toString();
    }

}
