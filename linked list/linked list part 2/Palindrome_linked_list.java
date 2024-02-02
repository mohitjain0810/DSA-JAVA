public class Palindrome_linked_list {
   // Definition for singly-linked list
   public static class ListNode {
      int val;
      ListNode next;

      ListNode(int val) {
         this.val = val;
      }
   }

   // Method to check if a linked list is a palindrome
   public static boolean isPalindrome(ListNode head) {
      // Check for an empty list
      if (head == null)
         return true;

      // Find the middle of the linked list
      ListNode mid = middle(head);

      // Reverse the second half of the linked list starting from mid.next
      ListNode last = reverse(mid.next);

      // Initialize a pointer to the head
      ListNode cur = head;

      // Compare the first and reversed second halves
      while (last != null) {
         if (last.val != cur.val)
            return false;

         last = last.next;
         cur = cur.next;
      }

      // If the loop completes, the linked list is a palindrome
      return true;
   }

   // Helper method to find the middle of the linked list
   public static ListNode middle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;

      // Use two pointers to find the middle
      while (fast.next != null && fast.next.next != null) {
         slow = slow.next;
         fast = fast.next.next;
      }

      // Return the middle node
      return slow;
   }

   // Helper method to reverse a linked list
   public static ListNode reverse(ListNode head) {
      if (head == null) {
         return head;
      }

      ListNode current = head;
      ListNode previous = null;
      ListNode next = null;

      // Reverse the linked list
      while (current != null) {
         next = current.next;
         current.next = previous;
         previous = current;
         current = next;
      }

      // Return the new head of the reversed linked list
      return previous;
   }

   // Main method for testing
   public static void main(String[] args) {
      // Example usage:

      // Create a linked list: 1 -> 2 -> 2 -> 1
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(2);
      head.next.next.next = new ListNode(1);

      // Check if the linked list is a palindrome
      boolean isPalindrome = isPalindrome(head);

      // Print the result
      System.out.println("Is Palindrome: " + isPalindrome);
   }
}
