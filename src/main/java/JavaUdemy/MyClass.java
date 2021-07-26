package JavaUdemy;

/**
 * Created by Soumya on Oct,2020
 */
public class MyClass {
    int i;
    MyClass(int i){
        this.i=i;
    }

    public static void main(String[] args) {
        MyClass myClass= new MyClass(8);
        System.out.println(myClass.i);
        System.out.println(myClass.init().i);
    }
    public MyClass init(){
        i=9;
        return this;
    }
}
