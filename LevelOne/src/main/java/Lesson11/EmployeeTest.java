package Lesson11;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan",100.55);
        double d = emp1.uvelechitl(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.zp2();
        System.out.println(emp1.salary);
    }
}
