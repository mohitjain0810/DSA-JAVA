import java.util.*;

import javax.management.RuntimeErrorException;

public class ExceptionsDemo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // int divident = sc.nextInt();
      // int divisor = sc.nextInt();

      // try{
      // int result = divident / divisor;
      // System.out.println("Your answer is: " + result);
      // }
      // catch(ArithmeticException e){
      // System.out.println(e.getMessage()+" or divisor don't be 0!!!");
      // }

      // int arr[] = new int[5];

      // try {
      // arr[6] = 10 / 0;
      // } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
      // System.out.println(e.getMessage());
      // }

      // int arr[] = new int[5];
      // try {
      // System.out.println("I am at first try block!!!");
      // try {
      // arr[6] = 10;
      // } catch (Exception e) {
      // System.out.println(e.getMessage());
      // }
      // } catch (Exception e) {
      // System.out.println(e.getMessage());
      // }

      // int age = sc.nextInt();

      // if(age<18){
      // throw new RuntimeException("Sorry can't vote");
      // }else{
      // System.out.println("You are eligible to vote");
      // }

      //throws
      // divisiondmeo(4, 0);

      //priority-vise
      try{
         int x = 10/0;
      }
      catch(ArithmeticException e){
         System.out.println(e.getMessage());
      }
      catch(Exception e){
         System.out.println(e.getMessage());
      }

   }

   // public static void divisiondmeo(int dividend, int division) throws ArithmeticException {
   //    System.out.println("The result is: " + dividend / division);
   // }

}
