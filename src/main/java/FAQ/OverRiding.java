package FAQ;

/**
 * Created by Soumya on Oct,2020
 */
public class OverRiding {
    public static void main(String[] args) {
      /*  Abc abc= new Abc();
        abc.test(); //parent class*/
        Xyz x = new Xyz();
        x.test(); // child class
        Abc a= new Xyz();
        a.test(); // child class
        a.display();
      /*  Xyz y= new Abc();
        y.test(); //Compile time error*/

    }
}

abstract class Abc{
 public abstract void display();
    public  void  test(){
        System.out.println("parent class");

    }
}
class Xyz extends Abc {
    public void display(){
        System.out.println("abstract class");
    }
    public void test(){
        System.out.println("child class");

    }
}
