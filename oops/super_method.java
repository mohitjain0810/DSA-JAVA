//To invoke parent class method
public class super_method {
   public static void main(String[] args) {
      Dog d = new Dog();
      d.eat();
      d.bark();
      d.work();
   }
}

class Animal {
   void eat() {
      System.out.println("Eating.......");
   }
}

class Dog extends Animal {
   void eat() {
      System.out.println("Eating bread.....");

   }
   void bark() {
      System.out.println("barking....");
   }
   void work(){
      super.eat();
      bark();
   }
}