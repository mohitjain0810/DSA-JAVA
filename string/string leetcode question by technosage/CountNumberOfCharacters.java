public class CountNumberOfCharacters {
   public static void main(String[] args) {
      String str = "Hello java";
      int count = 0;
      for(int i=0; i<str.length(); i++){
         if(str.charAt(i) != ' '){
            count++;
         }
      }
      System.out.println("Number of character in a string are: "+count);
   }
}
