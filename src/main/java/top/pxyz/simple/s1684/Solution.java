package top.pxyz.simple.s1684;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String s : words) {
            String word = s;
            for (int j = 0; j < allowed.length(); j++) {
                if (word.length() != 0) {
                    word = word.replaceAll(String.valueOf(allowed.charAt(j)), "");
                }
            }
            if (word.length() == 0) {
                count++;
            }
        }
        return count;
    }

}
