public class method_overloading {
   public static void main(String args[]) {
      int result = sum(2, 3, 4, 5);
      System.out.println(result);
   }

   public static int sum(int a, int b, int c, int d) {
      return (a + b + c + d);
   }

   public static int sum(int a, int b, int c) {
      return (a + b + c);
   }

   public static int sum(int a, int b) {
      return (a + b);
   }

   public static String sum(String x, String y) {
      return x + y;
   }

}