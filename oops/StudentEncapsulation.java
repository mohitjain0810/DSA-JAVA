public class StudentEncapsulation {
   public static void main(String[] args) {
      Student s1 = new Student();
      s1.set_age(1);
      s1.set_name("null");
      s1.set_rollno(22);
   
      System.out.println(s1.get_age());
      System.out.println(s1.get_name());
      System.out.println(s1.get_rollno());
   }
}

class Student {
   private String name;
   private int age;
   private int rollno;

   public String get_name() {
      return name;
   }

   public int get_age() {
      return age;
   }

   public int get_rollno() {
      return rollno;
   }

   public void set_name(String name) {
      this.name = name;
   }

   public void set_age(int age) {
      this.age = age;
   }

   public void set_rollno(int rollno) {
      this.rollno = rollno;
   }
}