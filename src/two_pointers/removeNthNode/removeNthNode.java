package two_pointers.removeNthNode;

import leetcode_classes.ListNode;

import java.util.List;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class removeNthNode {
    // Again since this uses ListNode, I am not sure how to write a unit test
    private static ListNode removeNthFromEnd(ListNode head, int n){
        // logic, use to pointers again. the first pointer will iterate through to the end
        // the second will be n positions behind the first.
        ListNode true_pointer = head;
        ListNode delay_pointer = head;

        for(int i = 0; i < n; i++){
            true_pointer = true_pointer.next;
        }

        if(true_pointer == null){
            return head.next;
        }

        while(true_pointer.next != null){
            true_pointer = true_pointer.next;
            delay_pointer = delay_pointer.next;
        }
        delay_pointer.next = delay_pointer.next.next;
        return head;
    }
}
