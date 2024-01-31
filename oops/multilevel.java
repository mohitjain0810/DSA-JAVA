public class multilevel {
   public static void main(String[] args) {
      C obj = new C();
      obj.methodC();
      obj.methodB();
      obj.methodA();
   }
}

class A {
   void methodA() {
      System.out.println("Method of class A ");
   }
}

class B extends A {
   void methodB() {
      System.out.println("Method of class B ");
   }
}

class C extends B {
   void methodC() {
      System.out.println("Method of class C ");
   }
}