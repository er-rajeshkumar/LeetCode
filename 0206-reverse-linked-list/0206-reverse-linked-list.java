class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode prev = null;
        while(currNode!= null){
            ListNode temp = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = temp;
        }
        return prev;
    }
}