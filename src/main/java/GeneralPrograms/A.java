package GeneralPrograms;

public class A {
    public  void a () {
        System.out.println("A");
    }
}
 class B extends A{
    public void b() {
        System.out.println("B");
    }
}
 class C extends B {
    public void c() {
        System.out.println("C");
    }
}
 class Test{
     public static void main(String[] args) {
         A a = new A();
         a.a();
         B b = new B();
         b.b();
         b.a();
         C c = new C();
         c.c();
         c.a();
         c.b();

         A a1= new C();
         a1.a();






     }

 }
