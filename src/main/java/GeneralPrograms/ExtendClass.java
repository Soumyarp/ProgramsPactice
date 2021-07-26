package GeneralPrograms;

/**
 * Created by Soumya
 */
public class ExtendClass {
    public static void main(String[] args) {
        AbstractClass ab = new AbstractClass() {
            @Override
            public void get() {
                System.out.println("test45678");
                post();
            }






   /* @Override
    public void get() {
        System.out.println("test get method implement in"+this.getClass());
        post();
    }*/


        };
    }
}