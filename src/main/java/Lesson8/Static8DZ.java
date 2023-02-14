package Lesson8;

public class Static8DZ {

    static double toMultiply(double a, double b, double c) {
        return a * b * c;
    }
    static double toDivide(double d, double e) {
        return d / e;
    }

    public static void main(String[] args) {
        double B1 = toMultiply(3, 4, 4);
        System.out.println("Результат умножения трех числе в первом методе:" + " " + B1);
        double B2 = toDivide(7,2);
        System.out.println("Результат полученный при делении первого числа на второе:"
                + " " + B2);





    }
}