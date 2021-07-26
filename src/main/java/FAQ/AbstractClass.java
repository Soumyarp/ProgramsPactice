package FAQ;

/**
 * Created by Soumya on Oct,2020
 */
public abstract class AbstractClass {
  abstract public void start();
  void stop(){
      System.out.println("stop with key");
  }
}
class Car extends  AbstractClass{

    @Override
    public void start() {
        System.out.println("Starts with key");
    }
    void stop(){
        System.out.println("stop with key");
    }

    public static void main(String[] args) {
        Car c = new Car();
        AbstractClass a = new Car();
        a.stop();
        a.start();
        c.start();
        a.stop();
    }
}
