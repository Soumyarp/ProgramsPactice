package FAQ;

/**
 * Created by Soumya on Oct,2020
 */
public class This {
    int i;
    public void setValue(int i){
    this.i=i;
    }
    public void show(){
        System.out.println(i);
    }
}
class Xy{
    public static void main(String[] args) {
        This t= new This();
        t.setValue(10);
        t.show();
    }
}