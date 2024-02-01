public class Swap_nodes_in_pairs {
   // Definition for singly-linked list
   public static class ListNode {
      int val;
      ListNode next;

      ListNode(int val) {
         this.val = val;
      }
   }

   // Function to swap nodes in pairs
   public static ListNode swapPairs(ListNode head) {
      // Create a dummy node to simplify the code
      ListNode dummy = new ListNode(0);
      dummy.next = head;

      // Initialize the pointer to the dummy node
      ListNode point = dummy;

      // Iterate through the list in pairs
      while (point.next != null && point.next.next != null) {
         // Nodes to be swapped
         ListNode swap1 = point.next;
         ListNode swap2 = point.next.next;

         // Perform the swap
         swap1.next = swap2.next;
         swap2.next = swap1;
         point.next = swap2;

         // Move the pointer to the next pair
         point = swap1;
      }

      // Return the modified linked list
      return dummy.next;
   }

   // Function to print the linked list
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

      // Swap nodes in pairs
      ListNode swappedList = swapPairs(node1);

      // Print the modified linked list after swapping nodes in pairs
      System.out.println("Linked List after Swapping Nodes in Pairs:");
      printList(swappedList);
   }
}
