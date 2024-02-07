public class Remove_nth_from_end {
   // Definition for singly-linked list
   public static class ListNode {
      int val;
      ListNode next;

      ListNode(int val) {
         this.val = val;
      }
   }

   public static ListNode removeNthFromEnd(ListNode head, int n) {
      // Check if the linked list is empty
      if (head == null) {
         return head;
      }

      // Create a dummy node to handle edge cases
      ListNode dummy = new ListNode(0);
      dummy.next = head;

      // Use two pointers (fast and slow) to find the nth node from the end
      ListNode fast = dummy;
      ListNode slow = dummy;

      // Move the fast pointer n nodes ahead
      for (int i = 0; i < n; i++) {
         fast = fast.next;
      }

      // Move both pointers until the fast pointer reaches the end
      while (fast.next != null) {
         slow = slow.next;
         fast = fast.next;
      }

      // Remove the nth node from the end by updating the next reference
      slow.next = slow.next.next;

      // Return the modified linked list
      return dummy.next;
   }

   public static void printList(ListNode head) {
      ListNode current = head;
      while (current != null) {
         System.out.print(current.val + " ");
         current = current.next;
      }
      System.out.println();
   }

   public static void main(String[] args) {

      // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
      ListNode node1 = new ListNode(1);
      ListNode node2 = new ListNode(2);
      ListNode node3 = new ListNode(3);
      ListNode node4 = new ListNode(4);
      ListNode node5 = new ListNode(5);

      node1.next = node2;
      node2.next = node3;
      node3.next = node4;
      node4.next = node5;

      // Print the original linked list
      System.out.println("Original Linked List:");
      printList(node1);

      // Remove the 2nd node from the end (n=2)
      int n = 2;
      ListNode modifiedList = removeNthFromEnd(node1, n);

      // Print the modified linked list
      System.out.println("Linked List after removing the " + n + "th node from the end:");
      printList(modifiedList);
   } 
}
