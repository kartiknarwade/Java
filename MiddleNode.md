java
java
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode hare = head;
        while (hare != null && hare.next != null) {
            head = head.next;
            hare = hare.next.next;
        }
        return head;
    }
}

public class MiddleNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        Solution solution = new Solution();
        ListNode middle = solution.middleNode(head);

        System.out.println("The middle node value is: " + middle.val);
        sc.close();
    }
}


