public class Flattering_of_linked_list {
   // Definition of a ListNode
   public static class ListNode {
      int data;
      ListNode next;
      ListNode bottom;

      ListNode(int data) {
         this.data = data;
      }
   }

   public static ListNode mergeTwoLists(ListNode a, ListNode b) {
      ListNode temp = new ListNode(0);
      ListNode res = temp;

      // Merge the two linked lists
      while (a != null && b != null) {
         if (a.data < b.data) {
            temp.bottom = a;
            temp = temp.bottom;
            a = a.bottom;
         } else {
            temp.bottom = b;
            temp = temp.bottom;
            b = b.bottom;
         }
      }

      // Append the remaining elements if any
      if (a != null)
         temp.bottom = a;
      else
         temp.bottom = b;

      return res.bottom;
   }

   public static ListNode flatten(ListNode root) {
      // Base case: if the list is empty or has only one level
      // Base case: if the list is empty or has only one level
      if (root == null || root.next == null) {
         return root;
      }

      // Print the original linked list before flattening
      System.out.print("Original Linked List: ");
      printList(root);

      // Recursively flatten the next level and merge with the current level
      root.next = flatten(root.next);
      root = mergeTwoLists(root, root.next);

      // Print the flattened linked list after flattening
      System.out.print("Flattened Linked List: ");
      printList(root);

      return root;
   }

   // Helper method to print a linked list
   static void printList(ListNode head) {
      while (head != null) {
         System.out.print(head.data + " ");
         head = head.bottom;
      }
      System.out.println();
   }

   // Main method for demonstration
   public static void main(String[] args) {

      // Example usage: Creating a linked list with multiple levels
      ListNode head = new ListNode(5);
      head.next = new ListNode(10);
      head.next.next = new ListNode(19);
      head.next.next.next = new ListNode(28);

      head.bottom = new ListNode(7);
      head.bottom.bottom = new ListNode(8);
      head.bottom.bottom.bottom = new ListNode(30);

      head.next.bottom = new ListNode(20);

      head.next.next.bottom = new ListNode(22);
      head.next.next.bottom.bottom = new ListNode(50);

      // Flattening the linked list
      ListNode flattenedList = flatten(head);

      // Print the flattened list for demonstration
      while (flattenedList != null) {
         System.out.print(flattenedList.data + " ");
         flattenedList = flattenedList.bottom;
      }
   }
}
