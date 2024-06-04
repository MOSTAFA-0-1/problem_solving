import java.util.ArrayList;

/**
 * marge_2_sorted_list
 */
public class marge_2_sorted_list {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(10))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(8)));
        Solution s = new Solution();
        ListNode result = s.mergeTwoLists(l1, l2);
        System.out.println(result.next.next.next.next.next.next.val);

    }
}

class ListNode {
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

class Solution {
    ArrayList<ListNode> list = new ArrayList<>();
    ListNode temp = new ListNode();

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else {
            if (list1.val <= list2.val) {
                temp = list2;
                list.add(list1);
            } else {
                temp = list1;
                list.add(list2);
            }
            while (list.get(list.size() - 1).next != null) {
                if (list.get(list.size() - 1).next.val <= temp.val) {
                    list.add(list.get(list.size() - 1).next);
                } else {
                    list.add(temp);
                    temp = list.get(list.size() - 2).next;
                    list.get(list.size() - 2).next = list.get(list.size() - 1);
                }
            }
            list.get(list.size() - 1).next = temp;
            return list.get(0);
        }

    }
}