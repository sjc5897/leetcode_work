package two_pointers;

import java.util.List;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
public class removeDupsFromSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode sentinel =   new ListNode(0,head);
        ListNode processNode = sentinel;

        while(head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                processNode.next = head.next;
            }else{
                processNode = processNode.next;
            }
            head = head.next;
        }
        return sentinel.next;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(4, new ListNode(5)))))));

        System.out.println(deleteDuplicates(head));

    }


}
