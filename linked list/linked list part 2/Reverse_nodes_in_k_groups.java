public class Reverse_nodes_in_k_groups {
   // Definition for singly-linked list
   public static class ListNode {
      int val;
      ListNode next;

      ListNode(int val) {
         this.val = val;
      }
   }

   public static ListNode reverseKGroup(ListNode head, int k) {
      // Check for edge cases
      if (head == null || k == 1)
         return head;

      // Create a dummy node to simplify the logic
      ListNode dummy = new ListNode(0);
      dummy.next = head;

      // Initialize pointers
      ListNode curr = dummy;
      ListNode prev = dummy;
      ListNode nex = dummy;

      int count = 0;

      // Count the number of nodes in the linked list
      while (curr.next != null) {
         curr = curr.next;
         count++;
      }

      // Reverse nodes in k-groups
      while (count >= k) {
         curr = prev.next;
         nex = curr.next;

         for (int i = 1; i < k; i++) {
            curr.next = nex.next;
            nex.next = prev.next;
            prev.next = nex;
            nex = curr.next;
         }

         prev = curr;
         count -= k;
      }

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
      ListNode head = new ListNode(1);
      ListNode node1 = new ListNode(2);
      ListNode node2 = new ListNode(3);
      ListNode node3 = new ListNode(4);
      ListNode node4 = new ListNode(5);

      head.next = node1;
      node1.next = node2;
      node2.next = node3;
      node3.next = node4;

      // Print the original linked list
      System.out.println("Original Linked List:");
      printList(head);

      // Reverse nodes in k-groups (e.g., k=3)
      ListNode reversedNodeKGroup = reverseKGroup(head, 3);

      // Print the modified linked list
      System.out.println("Modified Linked List:");
      printList(reversedNodeKGroup);
   }
}
