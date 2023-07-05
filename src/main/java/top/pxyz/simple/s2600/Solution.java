package top.pxyz.simple.s2600;


/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.kItemsWithMaximumSum(3, 2, 0, 2));
    }

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int r;
        if(k >= numOnes){
            r = numOnes;
            k = k - numOnes;
            if(k >= numZeros){
                k = k - numZeros;
            }else{
                return r;
            }
            r = r - k;
        } else {
            r = k;
        }
        return r;
    }

}
