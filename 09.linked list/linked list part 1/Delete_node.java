public class Delete_node {

   private static class ListNode {
      int val;
      ListNode next;

      ListNode(int val) {
         this.val = val;
      }
   }

   public static void deleteNode(ListNode node) {
      // Copy the value of the next node to the given node
      node.val = node.next.val;

      // Skip the next node by updating the next reference
      node.next = node.next.next;
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

      // Given node to delete: node3
      System.out.println("Original Linked List:");
      printList(node1);

      // Delete the given node
      deleteNode(node3);

      System.out.println("Linked List after deleting the given node:");
      printList(node1);
   }
}