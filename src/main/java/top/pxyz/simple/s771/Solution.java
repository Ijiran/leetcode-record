package top.pxyz.simple.s771;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if(stones.charAt(j) == jewels.charAt(i)){
                    result++;
                }
            }
        }
        return result;
    }

}
