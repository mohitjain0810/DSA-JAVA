import java.util.*;
import java.util.Scanner;

public class Biggest_element_in_array {
   public static void main(String[] args) {
      int arr[] = new int[5];
      int max;
      Scanner no = new Scanner(System.in);

      System.out.println("Enter Arrays Elements: ");
      for (int i = 0; i < 5; i++) {
         arr[i] = no.nextInt();
      }
      max = arr[0];
      for (int i = 1; i < 5; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
      }
      System.out.println("Maximum Element in the array is : " + max);
   }
}
