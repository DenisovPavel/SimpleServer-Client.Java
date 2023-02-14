package Employee;

public class Employee02 {
    public static void main(String[] args) {


        Employee01 Klient1 = new Employee01();
        Employee01 Klient2 = new Employee01();

        Klient1.Id = 01;
        Klient1.Surname = "Denisov";
        Klient1.Age = 33;
        Klient1.Salary = 130.000;
        Klient1.Department = 01;


        Klient2.Id = 02;
        Klient2.Surname = "Potapov";
        Klient2.Age = 32;
        Klient2.Salary = 60.000;
        Klient2.Department = 02;

        System.out.println("Повышение зарплаты вдвое:" + " " + Klient1.Surname + " " + "=" + "  " + Klient1.Zarplata(130.000));
        //System.out.println(); - для пробела между строками после компиляции!
        System.out.println("Повышение зарплаты вдвое:" + " " + Klient2.Surname + " " + "=" + "  " + Klient2.Zarplata(60.000));


    }
}

