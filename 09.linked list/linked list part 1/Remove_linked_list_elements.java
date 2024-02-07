public class Remove_linked_list_elements {
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
   public static ListNode removeElement(ListNode head, int targetElement){
      ListNode dummy = new ListNode(-1);
      dummy.next = head;
      ListNode current = dummy;
      while(current.next != null){
         if(current.next.data == targetElement){
            current.next = current.next.next;
         }else{
            current = current.next;
         }
      }
      return dummy.next;
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

    // Remove element with value 3 (for example)
    int targetElement = 3;
    head = removeElement(head, targetElement);

    // Print the modified linked list after removing the specified element
    System.out.println("Linked List after removing element " + targetElement + ":");
    display();
   }
}
