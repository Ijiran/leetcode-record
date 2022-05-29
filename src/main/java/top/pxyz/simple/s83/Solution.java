package top.pxyz.simple.s83;

/**
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
        int[] l1 = {1};
//        int[] l1 = {1,1,2,3,3};
        ListNode result = solution.deleteDuplicates(covert(l1));
        while (true){
            System.out.println(result.val);
            if(result.next == null){
                break;
            }else{
                result = result.next;
            }
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode result = new ListNode();
        result.val = head.val;
        ListNode z = result;

        ListNode oldListNode = head.next;
        int old = head.val;
        while (true){
            if(oldListNode == null){
                break;
            }
            if(oldListNode.val != old){
                z.next = new ListNode();
                z.next.val = oldListNode.val;
                z = z.next;
            }
            if(oldListNode.next == null){
                break;
            }
            old = oldListNode.val;
            oldListNode = oldListNode.next;
        }
        return result;
    }

}
