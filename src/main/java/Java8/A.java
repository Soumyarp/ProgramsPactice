package Java8;

public class A {
    public void show(){
        System.out.println("A");
    }

    }
    class B {
        public void show(){
            System.out.println("B");
        }
    }

    class C extends B{
        public static void main(String[] args) {
            C c = new C();
            c.show();
        }
    }

