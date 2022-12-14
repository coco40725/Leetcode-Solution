/**
 * @author Yu-Jing
 * @create 2022-08-15-AM 11:30
 */
public class Solution {

    // Recursion version
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;

        if (head.val != val){
            head.next = removeElements(head.next, val);
            return head;
        }else {
           return removeElements(head.next, val);
        }
    }
}



class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
