package Java8.Consumer;

import java.util.function.Consumer;

/**
 * Created by Soumya on Oct,2020
 */
public class Democon1 {
    public static void main(String[] args) {
        Consumer<String> c= s->System.out.println(s);
        c.accept("Consumer Concept");
    }
}
