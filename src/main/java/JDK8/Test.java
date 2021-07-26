package JDK8;

public class Test implements FunctionalInterface{
 //   FunctionalInterface func;

    @Override
    public void test() {
        System.out.println("test method is overided here");
    }

    public static void main(String[] args) {
        Test t= new Test();
        t.test();
        t.test3();
        t.test4();
        FunctionalInterface.test1();
       FunctionalInterface.test2();
    }

}
