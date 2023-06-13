
import java.util.ArrayList;

public class remove {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        // System.out.println(ListNode.N);
        Solution sl = new Solution();
        head = sl.removeNthFromEnd(head, 1);
        System.out.println(head.next.next.next.val);
        System.out.println(head.val);

    }
}

class Solution {
    ArrayList<ListNode> list = new ArrayList<>();
    int i = 0;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        list.add(head);
        for (i = 0; i < list.size(); i++) {

            if (list.get(i).next == null) {
                break;
            } else {
                list.add(list.get(i).next);
            }
        }

        if (n > 1 && n < list.size()) {
            list.get(i - n).next = list.get(i + 2 - n);
        } else if (n == 1) {
            if (i == 0) {

                return null;
            } else {
                list.get(i).next = null;
            }

        } else if (n == list.size()) {
            return head.next;
        }

        return head;
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
