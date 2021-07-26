package Java8.function;

import java.util.function.Function;

/**
 * Created by Soumya on Oct,2020
 */
public class FunctionDemo1 {
    public static void main(String[] args) {
        Function<Integer,Integer> t = f->f*f;
        System.out.println(t.apply(5));
        System.out.println(t.apply(10));

        //String length --int
        Function<String, Integer> fn =s->s.length();
        System.out.println(fn.apply("welcome"));
    }
}
