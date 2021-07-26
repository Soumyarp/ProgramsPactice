package GeneralPrograms;

import java.util.HashMap;

public class T {
    T(){
        System.out.println("inside t");
    }
}
 class U extends T {
    U(){
        System.out.println("inside u");
    }
}
 class V extends U {
    V(){
        System.out.println("inside v");
    }
}

class Execute{
    public static void main(String[] args) {

        V v= new V();
        T t= new V();
   //     U u= new T(); //compile time error

    }
}
