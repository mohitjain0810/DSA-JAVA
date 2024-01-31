import java.util.*;
import java.util.Scanner;;

public class Smallest_element_in_array {
   public static void main(String[] args) {
      int arr[] = new int[5];
      Scanner no = new Scanner(System.in);
      System.out.println("Enter Arrays Elemenet: ");
      for (int i = 0; i < 5; i++) {
         arr[i] = no.nextInt();
      }
      int min = arr[0];
      for (int i = 0; i < 5; i++) {
         if (arr[i] < min) {
            min = arr[i];
         }
      }
      System.out.println("Smallest element in the Arrays is : " + min);
   }
}
