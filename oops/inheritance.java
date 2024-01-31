public class inheritance {
   public static void main(String[] args) {
      // childclass chi = new childclass();
      // chi.display();
      // chi.show();
      car c1 = new car();
      c1.brand = "tata";
      c1.price = 5657687;
      c1.milage = 18.5;
      c1.ftype = "Diesel";
      c1.color = "yello";
      c1.sunroof = true;
      c1.display();
   }
}

class Vehicle {
   double price;
   double milage;
   String color;

   void display() {
      System.out.println("Price :" + price);
      System.out.println("Milage :" + milage);
      System.out.println("Color :" + color);
      System.out.println("");
   }
}

class car extends Vehicle {
   String ftype;
   boolean sunroof;
   String brand;
}
// class parentclass {
// void display() {
// System.out.println("Parent class method");
// }
// }

// class childclass extends parentclass {
// void show() {
// System.out.println("Child class method");
// }
// }