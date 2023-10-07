package day7;

public class RemoveDuplicatesFromSortedList_Leetcode_83 {

    //??
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //??
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode currentHead = head;

        while (currentHead != null && currentHead.next != null) {

            if (currentHead.val == currentHead.next.val) {
                currentHead.next = currentHead.next.next;
            } else {
                currentHead = currentHead.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
