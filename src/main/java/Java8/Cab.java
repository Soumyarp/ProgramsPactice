package Java8;

/**
 * Created by Soumya on Oct,2020
 */
public interface Cab {
    public void bookCab(String source, String destination);
}

/*class Ola implements Cab{
    public void bookCab(String source, String destination){
        System.out.println("Booking from"+source+"to"+destination );
    }
}*/

class Test1{
    public static void main(String[] args) {
        Cab cab =(source,destination)-> System.out.println("Booking from "+source+" to "+destination );
      //  return ("price is :5000");};

        cab.bookCab("Bangalore", "Berhampur");
    }

}
