package Java8.function;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Created by Soumya on Oct,2020
 */
public class FunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<Employee>al= new ArrayList<>();
        al.add(new Employee("abcde",20000));
        al.add(new Employee("wxyz",50000));
        al.add(new Employee("pwrs",70000));
        al.add(new Employee("pqrs",10000));
        al.add(new Employee("fdsw",30000));
     //   Function<Employee,Integer> fn=
    }
}

class Employee{
    String ename;
    int salary;
    Employee(String ename,int salary){
        this.ename=ename;
        this.salary=salary;
    }

}
