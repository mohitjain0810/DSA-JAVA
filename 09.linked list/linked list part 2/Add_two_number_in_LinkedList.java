public class Add_two_number_in_LinkedList {
   public static class ListNode {
      int val;
      ListNode next;

      ListNode(int val) {
         this.val = val;
      }
   }

   public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      // Dummy node to simplify the code
      ListNode dummy = new ListNode(0);
      ListNode ptr = dummy;
      int carry = 0;

      // Iterate through the linked lists until both are null
      while (l1 != null || l2 != null) {
         // Initialize sum with carry
         int sum = carry;

         // Add values from l1 and move to the next node
         if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
         }

         // Add values from l2 and move to the next node
         if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
         }

         // Update carry and add a new node to the result list
         carry = sum / 10;
         ptr.next = new ListNode(sum % 10);
         ptr = ptr.next;
      }

      // If there is a carry after the loop, add a new node
      if (carry > 0) {
         ptr.next = new ListNode(carry);
      }

      // Return the result excluding the dummy node
      return dummy.next;
   }

   public static void main(String[] args) {
      // Example usage of the addTwoNumbers function
      ListNode l1 = new ListNode(2);
      l1.next = new ListNode(4);
      l1.next.next = new ListNode(3);

      ListNode l2 = new ListNode(5);
      l2.next = new ListNode(6);
      l2.next.next = new ListNode(4);

      ListNode result = addTwoNumbers(l1, l2);

      // Print the result for demonstration
      while (result != null) {
         System.out.print(result.val + " ");
         result = result.next;
      }
   }
}
