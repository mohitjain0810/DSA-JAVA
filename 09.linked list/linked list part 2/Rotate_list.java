public class Rotate_list {
   public static class ListNode {
      int data;
      ListNode next;

      ListNode(int data) {
         this.data = data;
      }
   }

   // Method to rotate the linked list to the right by k places
   public static ListNode rotateRight(ListNode head, int k) {
      // Check for base cases: empty list, single node, or rotation of 0
      if (head == null || head.next == null || k == 0)
         return head;

      // Initialize current pointer to the head of the list
      ListNode curr = head;
      int length = 1;

      // Traverse the list to find its length
      while (curr.next != null) {
         length++;
         curr = curr.next;
      }

      // Connect the last node to the head to create a circular linked list
      curr.next = head;
      // Calculate the effective rotation by taking the modulo of k with the length
      k = k % length;
      // Calculate the new position of the current pointer after rotation
      k = length - k;
      // Move the current pointer to the new position
      while (k-- > 0) {
         curr = curr.next;
      }
      // Update the head to the next node after rotation
      head = curr.next;
      // Disconnect the circular link to form the rotated linked list
      curr.next = null;
      // Return the rotated linked list
      return head;
   }

   // Helper method to print a linked list
   static void printList(ListNode head) {
      while (head != null) {
         System.out.print(head.data + " ");
         head = head.next; // Corrected from head.bottom to head.next
      }
      System.out.println();
   }

   public static void main(String[] args) {
      // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head.next.next.next.next = new ListNode(5);

      // Print the rotated linked list: 4 -> 5 -> 1 -> 2 -> 3
      System.out.println("Original List:");
      printList(head);

      // Rotate the linked list to the right by 2 places
      ListNode rotatedList = rotateRight(head, 2);

      System.out.println("Rotated List:");
      printList(rotatedList);
   }
}
