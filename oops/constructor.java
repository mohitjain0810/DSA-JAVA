public class constructor {
   public static void main(String[] args) {
      Students obj1 = new Students();
      Students obj2 = new Students(5, 19);
      Students obj3 = new Students(5,23,"xxx");
   }

}

class Students {
   int id;
   int age;

   Students(int id, int age) {
      this.id = id;
      this.age = age;
      System.out.println("Parameterized constructor");
   }

   Students() {
      System.out.println("Default constructor");
   }

   Students(int id, int age, String name) {
      System.out.println("this is parameterized constructor 2");
   }
}