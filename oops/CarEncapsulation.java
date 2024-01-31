public class CarEncapsulation {
   public static void main(String[] args) {
      tata nexo = new tata();
      nexo.color();
      nexo.fuelType();
   }
}

abstract class car {
   abstract public void fuelType();

   public void color() {
      System.out.println("Black color");
   }
}

class tata extends car {
   public void fuelType() {
      System.out.println("Disel");
   }
}