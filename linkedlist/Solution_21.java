/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        ListNode a = new ListNode(-1);
        ListNode arr = a;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                arr.next = l1;
                arr = arr.next;

                l1 = l1.next;
            }else{
                arr.next = l2;
                arr = arr.next;

                l2 = l2.next;
            }
        }

        if (l1 == null) {
            arr.next = l2;
        }else{
            arr.next = l1;
        }

        return a.next;


    }
}