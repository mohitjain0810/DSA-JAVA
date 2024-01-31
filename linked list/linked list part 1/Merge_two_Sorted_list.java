public class Merge_two_Sorted_list {
   // Definition for singly-linked list
   public static class ListNode {
      int val;
      ListNode next;

      ListNode(int val) {
         this.val = val;
      }
   }

   public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      // Create a dummy node to simplify the code
      ListNode dummy = new ListNode(-1);
      ListNode current = dummy;

      // Traverse both lists and compare the nodes
      while (list1 != null && list2 != null) {
         if (list1.val < list2.val) {
            current.next = list1;
            list1 = list1.next;
         } else {
            current.next = list2;
            list2 = list2.next;
         }
         current = current.next;
      }

      // If one of the lists is not fully traversed, append the remaining nodes
      if (list1 != null) {
         current.next = list1;
      } else {
         current.next = list2;
      }

      // The merged list starts from the next of the dummy node
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
      // Create two sorted linked lists
      ListNode list1 = new ListNode(1);
      list1.next = new ListNode(3);
      list1.next.next = new ListNode(5);

      ListNode list2 = new ListNode(2);
      list2.next = new ListNode(4);
      list2.next.next = new ListNode(6);

      // Print the original lists
      System.out.println("List 1:");
      printList(list1);

      System.out.println("List 2:");
      printList(list2);

      // Merge the two lists
      ListNode mergedList = mergeTwoLists(list1, list2);

      // Print the merged list
      System.out.println("Merged List:");
      printList(mergedList);
   }
}
