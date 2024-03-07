public class Largest_String {
   public static void main(String[] args) {
      String Fruits[] = { "apple", "mango", "banana" };
      String largest = Fruits[0];
      for (int i = 1; i < Fruits.length; i++) {
         if (largest.compareTo(Fruits[i]) < 0) {
            largest = Fruits[i];
         }
      }
      System.out.println(largest);
   }
}
