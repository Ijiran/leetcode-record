package top.pxyz.simple.s121;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > result) {
                    result = profit;
                }
            }
        }
        return result;
    }

    public int maxProfit2(int[] prices) {
        int min = 10001;
        int max = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > max) {
                max = price - min;
            }
        }
        return max;
    }

    public int maxProfit1(int[] prices) {
        int min = prices[0];
        int minIndex = 0;
        //获取最小值
        for (int i = 0; i < prices.length; i++) {
            if(min > prices[i]){
                min = prices[i];
                minIndex = i;
            }
        }
        int result = 0;
        for (int i = minIndex; i < prices.length; i++) {
            int t = prices[i] - min;
            if(result < t){
                result = t;
            }
        }
        return result;
    }

}
