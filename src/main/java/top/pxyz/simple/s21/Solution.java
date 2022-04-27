package top.pxyz.simple.s21;

/**
 * 合并两个有序链表
 * @author Ijiran
 */
public class Solution {

    private static ListNode covert(int[] nums){
        ListNode result = new ListNode();
        ListNode z = result;
        for (int i = 0;  i < nums.length; i++){
            z.val = nums[i];
            if(i != nums.length - 1){
                z.next = new ListNode();
                z = z.next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] l1 = {1,2,4};
        int[] l2 = {1,3,4};
        ListNode result = solution.mergeTwoLists(covert(l1), covert(l2));
        while (true){
            System.out.println(result.val);
            if(result.next == null){
                break;
            }else{
                result = result.next;
            }
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //特殊情况处理
        if(list1 == null && list2 == null){
            return null;
        }else if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }
        ListNode result = new ListNode();
        //中间值声明
        ListNode z = result;
        //循环比对
        while (true){
            //对比填充值
            if(list1.val <= list2.val){
                z.val = list1.val;
                list1 = list1.next != null ? list1.next : null;
            }else{
                z.val = list2.val;
                list2 = list2.next != null ? list2.next : null;
            }
            //判断是否退出循环
            if(list1 == null){
                z.next = list2;
                break;
            }else if(list2 == null){
                z.next = list1;
                break;
            }
            z.next = new ListNode();
            z = z.next;
        }
        return result;
    }

}
