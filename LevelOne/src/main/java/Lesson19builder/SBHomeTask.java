package Lesson19builder;
// Метод принимающий в параметр StringBuilder и возвращающий значение Boolean при сравнении двух слов;

public class SBHomeTask {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args) {
        boolean result = ravenstvo(new StringBuilder("Hello"), new StringBuilder("Hello"));
        System.out.println(result);//True;
        boolean result2 = ravenstvo(new StringBuilder("hello"), new StringBuilder("Hello"));
        System.out.println(result2);//False;
    }
}

