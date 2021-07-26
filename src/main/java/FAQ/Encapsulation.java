package FAQ;

/**
 * Created by Soumya on Oct,2020
 */
public class Encapsulation {
    private int emp_id;

    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
}
class Employee{
    public static void main(String[] args) {
       Encapsulation e = new Encapsulation();
        System.out.println (e.getEmp_id());
        e.setEmp_id(102);
        System.out.println (e.getEmp_id());
    }
}
