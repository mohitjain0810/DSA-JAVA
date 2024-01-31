public class Midde_of_linked_list {
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

   public static ListNode middleNode(ListNode head) {
      if (head == null)
         return null;
      ListNode slowptr = head;
      ListNode fastptr = head;
      while (fastptr != null && fastptr.next != null) {
         slowptr = slowptr.next;
         fastptr = fastptr.next.next;
      }
      return slowptr;
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

      // Find and print the middle node of the linked list
      ListNode middleNode = middleNode(head);
      System.out.println("\nMiddle Node of the Linked List: " + middleNode.data);
   }
}
