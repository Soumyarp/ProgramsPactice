package FAQ;

/**
 * Created by Soumya on Oct,2020
 */
public class Super {
    Super(){
       System.out.println("I m in super class Constructor");
    }
  void m1(){
      System.out.println("parent class");
  }
}
class B extends Super{
    B(){
        super();
        System.out.println("I m in B class Constructor");
    }
    @Override
    void m1() {
    //    super.m1();
        System.out.println("chid class");
    }

    void show(){
m1();
super.m1();
this.m1();
    }

    public static void main(String[] args) {
        B b = new B();
        b.show();
        Super s = new Super();
        s.m1();
        Super s1= new B();
        s1.m1();
    }
}