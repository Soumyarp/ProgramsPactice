package Java8;

import java.util.function.Predicate;

/**
 * Created by Soumya on Oct,2020
 */
public class Demo1 {
    public static void main(String[] args) {
 //Eg-1
        Predicate<Integer> p=i->(i>10);
        System.out.println(p.test(20));//true
        System.out.println(p.test(5));//false
//Eg -2
        Predicate<String> p1=str->(str.length()>4);
        System.out.println(p1.test("soumya"));//true
        System.out.println(p1.test("abc"));//false

        // Eg-3n --Print Array Element whose size is >4
        String names[]={"abcd","pwxyz","qwerty","asdfghjkl"};
        Predicate<String> pr=str->(str.length()>4);
        for(String name:names){
           if(pr.test(name)){
                System.out.println(name);
           }
        }
    }


}
