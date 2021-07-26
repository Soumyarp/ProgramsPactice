package Java8;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Created by Soumya on Oct,2020
 */
public class Demo2 {
    public static void main(String[] args) {
        //Ex-1 for Singe Employee
    Employee e= new Employee("Soumya",80000,5);
    Predicate<Employee> pt=employee -> (employee.salary>50000 && employee.exp>3);
        System.out.println(pt.test(e));

        //Eg-2 :: For Multiple Employees
        ArrayList<Employee>arrayList= new ArrayList<>();
        arrayList.add(new Employee("abcd",80000,5));
        arrayList.add(new Employee("wxyz",40000,3));
        arrayList.add(new Employee("pqrs",20000,2));
        arrayList.add(new Employee("defg",10000,4));
        arrayList.add(new Employee("mnop",60000,1));

        for(Employee employee:arrayList){
            if(pt.test(employee)){
                System.out.println(employee.ename +" "+employee.exp);
            }
        }

    }
}
class Employee{
    String ename;
    int salary;
    int exp;
    Employee(String ename,int salary,int exp){
        this.ename=ename;
        this.salary=salary;
        this.exp=exp;
    }

}
