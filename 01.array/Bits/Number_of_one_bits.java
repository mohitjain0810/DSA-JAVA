
public class Number_of_one_bits {

   public static void main(String[] args) {
      // Example usage:
      String binaryString = "00000000000000000000000000001011";
      int result = hammingWeight(binaryString);

      System.out.println("Number of 1 bits: " + result);
   }

   public static int hammingWeight(String binaryString) {
      int n = Integer.parseUnsignedInt(binaryString, 2);
      int mask = 1;
      int count = 0;

      for (int i = 0; i < 32; i++) {
         if ((n & mask) != 0)
            count++;
         mask = mask << 1;
      }
      return count;
   }
}
