import java.util.*;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      System.out.println("Welcome yp Library Management System!\n"
            + "1. Login\n2. New User");
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      switch (n) {
         case 1:
            login();
         case 2:
            newUser();
         default:
            System.out.println("Error!");
      }
   }

   private void newUser() {
      System.out.println("Enter name: ");
      String name = s.next();
      System.out.println("Enter your phone number: ");
      String phonenumber = s.next();
      System.out.println("Enter email");
      String mail = s.next();
      System.out.println("1. Admin\n2. Normal User");
      int n2 = s.next();
      if (n2 == 1) {
         User admin = new Admin(name, email, phonenumber);
      } else {
         User user = new User(name, email, phonenumber);
      }
   }

   private void login() {
      System.out.println("Enter your phone number: ");
      String phonenumber = s.next();
      System.out.println("Enter email");
      String mail = s.next();
   }
}
