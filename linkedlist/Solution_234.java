
/**
 * @author zhoushuyi
 * @since 2019/1/9
 */
public class Solution_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }


        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode reverse = reverse(slow.next);

        while (reverse != null) {
            if (head.val != reverse.val) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }

        return true;
    }

    /**
     * 将链表反转
     * @param head
     * @return
     */
    public ListNode reverse(ListNode head) {
        if (head.next == null)
            return head;


        ListNode a = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return a;
    }

}
