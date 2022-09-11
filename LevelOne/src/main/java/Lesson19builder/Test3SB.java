package Lesson19builder;

public class Test3SB {
    public static void main(String[] args) {

        // конструктор класса String;Он может принять в свои параметры обьект класса стрингбилдер!
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuffer sb2 = new StringBuffer("Good Bye");

        String s1 = new String(sb1);
        String s2 = new String(sb2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
