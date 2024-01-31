public class method_overriding {
   public static void main(String[] args) {
      Bank obj = new Bank();
      SBI obj1 = new SBI();
      PNB obj2 = new PNB();
      obj.RateOfInterest();
      obj1.RateOfInterest();
      obj2.RateOfInterest();
   }

}

class Bank {
   public void RateOfInterest() {
      System.out.println("Generally rate of interest is 5%");
   }
}

class SBI extends Bank {
   @Override
   public void RateOfInterest() {
      System.out.println("Rate of interest for SBI is 6.5%");
   }
}

class PNB extends Bank {
   @Override
   public void RateOfInterest() {
      System.out.println("Rate of interest for PNB is 6%");
   }
}
