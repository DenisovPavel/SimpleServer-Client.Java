package Lesson07;

class Employee003 {
    private double Salary;

    void ZarPlaTa() {
        System.out.println("Зарплата клиента:" + "  " + Salary);}
    Employee003(double Salary2) {
        Salary = Salary2;
    }
    public static void main(String[] args) {
        Employee003 NewEmp3 = new Employee003(202.15);
        System.out.println("Зарплата сотрудника составляет:"+ "  " + NewEmp3.Salary + "  " + "долларов в час;");
    }
}

