package top.pxyz.simple.s605;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(new int[]{1,0,0,0,0}, 2));
    }

    /**
     * 第一步，先来处理数组长度等于1的情况，如果元素等于0，则比对n和1的大小值，返回结果。
     *
     * 第二步，开始统计连续三次0出现的次数和序列数值。
     *
     * 第三步，开始处理全是0的情况。
     *
     * 第四步，开始处理最后一波为0的个数是否等于或者超过2次，因为是尾部，所以也试做加1。
     *
     * 第五步，开始处理头部的0是否存在连续两个0以上的情况。
     *
     * 第六步，开始正式转换数值，通过规律来计算出具体值。
     *
     * 第七步，比对和n的大小。
     *
     * @param flowerbed
     * @param n
     * @return
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if(flowerbed[0] == 0){
                return n <= 1;
            }else{
                return n <= 0;
            }
        }
        List<Integer> kongweiList = new ArrayList<>();
        int kongweiCount = 0;
        for (int j : flowerbed) {
            if (j == 0) {
                kongweiCount++;
            } else if (kongweiCount >= 3) {
                kongweiList.add(kongweiCount);
                kongweiCount = 0;
            } else {
                kongweiCount = 0;
            }
        }
        int r = 0;
        //全是0的情况
        if(kongweiCount == flowerbed.length){
            return flowerbed.length / 2 >= n;
        }
        //首尾是否存在0的情况
        if(kongweiCount >= 2){
            kongweiList.add(++kongweiCount);
        }
        if(flowerbed.length >= 3 && flowerbed[0] == 0 && flowerbed[1] == 0){
            r++;
        }
        for (Integer k : kongweiList){
            r = r + (k - 1) / 2;
        }
        return r >= n;
    }

}
