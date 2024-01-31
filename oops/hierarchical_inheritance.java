public class hierarchical_inheritance {
   public static void main(String[] args) {
      B obj = new B();
      obj.print();
      obj.printB();
   }
}

class A {
   public void print() {
      System.out.println("class A methods");
   }
}

class B extends A {
   public void printB() {
      System.out.println("class B methods");
   }
}

class C extends A {
   public void printC() {
      System.out.println("class C methods");
   }
}