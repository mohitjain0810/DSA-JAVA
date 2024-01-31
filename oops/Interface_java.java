public class Interface_java {
   public static void main(String[] args) {
      Car tesla = new ElectericCar();
      Car tata = new DiselCar();
      tesla.start();
      tata.start();
   }
}

interface Car {
   public void start();
}

class ElectericCar implements Car {
   public void start() {
      System.out.println("ElectricCar Start");
   }
}
class DiselCar implements Car{
    public void start() {
      System.out.println("DiselCar Start");
   }
}