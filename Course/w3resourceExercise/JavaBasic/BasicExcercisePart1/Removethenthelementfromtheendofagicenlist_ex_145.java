public class Removethenthelementfromtheendofagicenlist_ex_145 {
    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);

        ListNode o = h;
        System.out.println("Original node:");

        while (o != null) {
            System.out.println(o.val + " ");
            o = o.next;
        }

        System.out.println("After Removing end element from end:");

        ListNode head = removeNthFromEnd(h, 2);

        while (head != null) {
            System.out.println(head.val + " ");
            head = head.next;
        }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int size = 0;

        while (p != null) {
            size++;
            p = p.next;
        }

        if (n == size) {
            head = head.next;
        } else {
            int index = size - n;
            ListNode t = head;

            while (index > 1) {
                t = t.next;
                index--;
            }
            t.next = t.next.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = next;
    }
}
