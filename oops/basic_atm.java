import java.util.*;

public class basic_atm {
   public static void main(String[] args) {
      ATM onj1 = new ATM();
      onj1.checkpin();
   }
}

class ATM {
   float Balance;
   int PIN = 5674;

   public void checkpin() {
      System.out.println("Enter your pin: ");
      Scanner sc = new Scanner(System.in);
      int enteredpin = sc.nextInt();
      if (enteredpin == PIN) {
         menu();
      } else {
         System.out.println("You Entered the wrong pin");
      }
   }

   public void menu() {
      System.out.println("Enter Your Choice: ");
      System.out.println("1. Check A/C Balance");
      System.out.println("2. Withdraw Money");
      System.out.println("3. Deposite Money");
      System.out.println("4. Exit");

      Scanner sc = new Scanner(System.in);
      int opt = sc.nextInt();

      if (opt == 1) {
         checkBalance();
      } else if (opt == 2) {
         withdrwMoney();
      } else if (opt == 3) {
         depositeMoney();
      } else if (opt == 4) {
         return;
      } else {
         System.out.println("Enter the valid PIN: ");
      }
   }

   public void depositeMoney() {
      System.out.println("Enter the Amount of Money: ");
      Scanner sc = new Scanner(System.in);
      float amount = sc.nextInt();
      Balance = Balance + amount;
      System.out.println("Money deposite Succesfully");
      menu();
   }

   public void withdrwMoney() {
      System.out.println("Enter the Amount to Withdraw: ");
      Scanner sc = new Scanner(System.in);
      float amount = sc.nextInt();
      if (amount > Balance) {
         System.out.println("Insufficient Balance");
      } else {
         Balance = Balance - amount;
         System.out.println("Money withdraw succesfully");
      }
      menu();
   }

   public void checkBalance() {
      System.out.println("The balance of your account: " + Balance);

   }

}

