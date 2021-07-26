package FAQ;

/**
 * Created by Soumya on Oct,2020
 */
public class Threads {
    private int myint=0;
    public int addOne(){
        int temp=myint;
        temp=temp+1;
        myint=temp;
        return temp;
    }

    public static void main(String[] args) {
        Threads t= new Threads();
        t.addOne();
    }
}
