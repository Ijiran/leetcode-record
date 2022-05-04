package top.pxyz.difficulty.d4;

/**
 * 寻找两个正序数组的中位数
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        if(result.length == 0){
            return 0.0;
        }else if(nums1.length == 0){
            result = nums2;
        }else if(nums2.length == 0){
            result = nums1;
        }else{
            boolean is1 = nums1[0] < nums2[0];
            int num1 = 0;
            int num2 = 0;
            int resultIndex = 0;
            while(true){
                if(resultIndex == result.length){
                    break;
                }
                if(is1){
                    result[resultIndex] = nums1[num1];
                    resultIndex++;
                    num1++;
                    if(num2 > nums2.length - 1){
                        continue;
                    }else if(num1 > nums1.length - 1 || nums1[num1] > nums2[num2]){
                        is1 = false;
                    }
                }else{
                    result[resultIndex] = nums2[num2];
                    resultIndex++;
                    num2++;
                    if(num1 > nums1.length - 1){
                        continue;
                    }else if(num2 > nums2.length - 1 || nums2[num2] > nums1[num1]){
                        is1 = true;
                    }
                }
            }
        }
        if(result.length % 2 != 0){
            return (result[result.length / 2]);
        }else{
            int s1 = result.length / 2;
            int s2 = result.length / 2 -1;
            return (result[s1] + result[s2]) / 2.0;
        }
    }

}
