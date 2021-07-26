package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Soumya
 */
public class Removeoddandeven {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        /*ar.removeIf(num->num%2==0);
        System.out.println("odd num list-->"+ar);*/
        ar.removeIf(num->num%2!=0);
        System.out.println("even no list-->"+ar);
    }
}
