package top.pxyz.simple.s1768;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abc", "pqr"));
        System.out.println(solution.mergeAlternately("abcd", "pq"));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder(word1);
        int index = -1;
        for (int i = 1; i < stringBuilder.length(); i = i + 2) {
            if(++index < word2.length()){
                stringBuilder.insert(i, word2.charAt(index));
            }
        }
        if(index < word2.length() - 1){
            stringBuilder.append(word2.substring(index + 1));
        }
        return stringBuilder.toString();
    }

}
