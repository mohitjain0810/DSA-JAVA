public class Reverse_linked_list {
   // Instance variable of type listnode
   static ListNode head;

   // Create listnode class
   private static class ListNode {
      private int data;
      private ListNode next;

      // Constructor to initialize a ListNode with a given data value
      public ListNode(int data) {
         this.data = data;
         this.next = null;
      }
   }

   // Method to print all the elements of singly linked list
   public static void display() {
      ListNode current = head;
      while (current != null) {
         System.out.print(current.data + "-->");
         current = current.next;
      }
      System.out.println("NULL");
   }

   // Method to insert a node at the beginning of the linked list
   public static void insertFirst(int value) {
      ListNode newnode = new ListNode(value);
      newnode.next = head;
      head = newnode;
   }

   // Method to reverse a linked list
   public static ListNode reverseList(ListNode head) {
      ListNode prev = null;
      ListNode next = null;
      ListNode current = head;

      while (current != null) {
         next = current.next;
         current.next = prev;
         prev = current;
         current = next;
      }
      return prev;
   }

   public static void main(String[] args) {

      // Insert nodes at the beginning of the linked list
      insertFirst(5);
      insertFirst(4);
      insertFirst(3);
      insertFirst(2);
      insertFirst(1);

      // Print the original linked list
      System.out.println("Original Linked List:");
      display();

      // Reverse the linked list using the reverseList method
      head = reverseList(head);

      // Print the reversed linked list
      System.out.println("\nReversed Linked List:");
      display();
   }
}