package Lesson04;

public class MyFirst {

    public static void main(String[] args) {
        System.out.println(sredArif(3,4,5));
    }

    public static double staticMethod(){
        return 1;
    }

    public void justExample() {
        System.out.println("Hello!!!!");
    }

    public static double sredArif(double a, double b,double c){
        return (a + b + c) / 3;
    }
}
