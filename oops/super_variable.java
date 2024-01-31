//To invoke parent class variable
public class super_variable {
   public static void main(String[] args) {
      Dog d = new Dog();
      d.printColor();
   }
}

class Animal{
   String color = "White";
}
class Dog extends Animal{
   String color  = "Black";
   void printColor(){
      System.out.println(color);//prints the color of Dog class
      System.out.println(super.color);//prints the color of Animal class
   }
}
