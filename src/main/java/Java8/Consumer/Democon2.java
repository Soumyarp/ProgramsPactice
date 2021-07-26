package Java8.Consumer;

import com.sun.org.apache.xpath.internal.compiler.FunctionTable;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Soumya on Oct,2020
 */
public class Democon2 {
    public static void main(String[] args) {
        ArrayList<Employee> empList= new ArrayList<Employee>();
        empList.add(new Employee("abcd",20000,"male"));
        empList.add(new Employee("wxyz",44000,"male"));
        empList.add(new Employee("pqrs",50000,"female"));
        empList.add(new Employee("defg",70000,"male"));
        empList.add(new Employee("lmno",10000,"female"));
//Function Interface --Task-1
        Function<Employee,Integer> f= emp->(emp.sal*10)/100;
////Predicate Interface --Task-2
        Predicate<Integer> p=b->b>=5000;
//Consumer Interface --Task-3
        Consumer<Employee> c=emp->System.out.println(emp.ename+"  "+emp.sal+"  "+emp.gender);

        for (Employee e:empList){
            int bonus =f.apply(e);
            if(p.test(bonus)){
                c.accept(e);
                System.out.println("Bonus is "+bonus);
            }
        }
    }
}

class Employee{
    String ename;
    int sal;
    String gender;
    Employee(String ename, int sal, String gender){
        this.ename=ename;
        this.sal=sal;
        this.gender=gender;

     //   format-number(number,pattern[decimal-format]);
    }
}
