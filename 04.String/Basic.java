import java.util.Scanner;

public class Basic {
   public static void main(String[] args) {
      // char arr[] = { 'a', 'b', 'c', 'd' };
      // String str1 = "abcd";
      // String str2 = new String("xyz"); // new memory allocation

      // Scanner sc = new Scanner(System.in);
      // String name;
      // name = sc.nextLine();
      // System.out.println(name);

      // String fullname = "Mohit Jain";
      // System.out.println(fullname.length());

      // // concatenation
      // String firstName = "Mohit";
      // String lastName = "Jain";
      // String fullName = firstName + " " + lastName;
      // System.out.println(fullName + " is this");
      // System.out.println(fullName.charAt(0));
      // printLetters(fullName);

      // Comparasion
      String s1 = "Tony";
      String s2 = "Tony";
      String s3 = new String("Tony");

      if (s1 == s2) {
         System.out.println("Strings are equal");
      } else {
         System.out.println("Strings are not equal");
      }

      if (s1 == s3) {
         System.out.println("Strings are equal");
      } else {
         System.out.println("Strings are not equal");
      }

      if (s1.equals(s3)) {
         System.out.println("Strings are equal");
      } else {
         System.out.println("Strings are not equal");
      }
   }

   public static void printLetters(String str) {
      for (int i = 0; i < str.length(); i++) {
         System.out.print(str.charAt(i) + " ");
      }
   }
}
