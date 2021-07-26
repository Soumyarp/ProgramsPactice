package JDK8;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public void test();
    public static void test1(){
        System.out.println("hi");
    }

    public static  void test2(){
        System.out.println("hello");
    }

    default void test3(){
        System.out.println("h1");
    }

    default void test4(){
        System.out.println("h2");
    }




}
