package Lesson04;

public class Main {

    public static void main(String[] args) {
        // static
        System.out.println(MyFirst.staticMethod());

        // non-static
        MyFirst myFirst = new MyFirst();
        myFirst.justExample();
    }
}
