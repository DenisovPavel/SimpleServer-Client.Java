package Lesson05;

public class BankAccount {
    int id;
    String name;
    double balance;

    double PovishenieScheta(double a1) {
        double result = balance + a1;
        return result;
    }

    double PonizhenieScheta(double b1) {
        double result = balance - b1;
        return result;
    }
}
