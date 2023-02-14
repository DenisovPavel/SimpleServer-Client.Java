package Lesson05;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount Vladimir = new BankAccount();
        BankAccount Petr = new BankAccount();
        BankAccount Oleg = new BankAccount();

        Vladimir.id = 5;
        Vladimir.name = "Володя";
        Vladimir.balance = 110.5;

        Petr.id = 6;
        Petr.name = "Петр";
        Petr.balance = 120.5;

        Oleg.id = 7;
        Oleg.name = "Олег";
        Oleg.balance = 130.5;

        System.out.println("Клиент банка 1:" + "  " + Vladimir.name +"  " + "Номер счета клиента:" + "  " + Vladimir.id + "  "+ "Баланс счета клиента:" + "  " + Vladimir.balance);
        System.out.println("Клиент банка 2:" + "  " + Petr.name +"  " + "Номер счета клиента:" + "  " + Petr.id + "  "+ "Баланс счета клиента:" + "  " + Petr.balance);
        System.out.println("Клиент банка 3:" + "  " + Oleg.name +"  " + "Номер счета клиента:" + "  " + Oleg.id + "  "+ "Баланс счета клиента:" + "  " + Oleg.balance);


    }
}