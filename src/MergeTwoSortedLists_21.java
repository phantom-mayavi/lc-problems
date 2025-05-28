public class MergeTwoSortedLists_21 {
    public static void main(String[] args) {
        MergeTwoSortedLists_21 myObj = new MergeTwoSortedLists_21();
        System.out.println(myObj.mergeTwoLists(null, null));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode currNode = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                currNode.next = list2;
                list2 = list2.next;
            } else {
                currNode.next = list1;
                list1 = list1.next;
            }
            currNode = currNode.next;
        }

        currNode.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
}
