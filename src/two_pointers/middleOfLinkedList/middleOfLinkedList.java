package two_pointers.middleOfLinkedList;

import leetcode_classes.ListNode;

import java.util.List;

// https://leetcode.com/problems/middle-of-the-linked-list/
public class middleOfLinkedList {

    // Use two pointers and iterate one twice as fast as the other,
    // this creates
    private static ListNode sol1(ListNode head){
        ListNode slow_pointer = head;
        ListNode fast_pointer = head;
        while(fast_pointer != null && fast_pointer.next != null){
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
        }
        return slow_pointer;

    }


    public static ListNode middleNode(ListNode head){
        return sol1(head);
    }
}
