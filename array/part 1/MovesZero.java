public class MovesZero {
   public static void main(String[] args) {
      int nums[] = { 0, 1, 0, 3, 0, 12, 4, 0, 1 };
      moveszeros(nums);

      // Print the result
      System.out.print("[");

      for (int i = 0; i < nums.length; i++) {
         System.out.print(nums[i]+"  ");
      }
      System.out.println("]");
   }

   public static void moveszeros(int nums[]) {
      int insertPosition = 0;
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] != 0) {
            nums[insertPosition] = nums[i];
            insertPosition++;
         }
      }
      while (insertPosition < nums.length) {
         nums[insertPosition++] = 0;
      }
   }
}
