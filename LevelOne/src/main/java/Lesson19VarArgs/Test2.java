package Lesson19VarArgs;

public class Test2 {
    static void summa(int... a) {//метод varargs может указываться в параметрах только 1 раз;
        // varargs представляется в java как массив;
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    public static void main(String[] args) {
        summa();
        summa(2, 3);
        summa(2, 3, 6);
    }
}
// public static void abc(int[] ... array){}-это значит что можно использовать либо один,
// либо два либо сколько угодно массивов varargs =)

//
//    static void summa(int a, int b, int c) {
//        System.out.println("Сумма 3 элементов ровна:" + a + b + c);
//    }
//
//    static void summa(int a, int b, int c, int d) {
//        System.out.println("Сумма 4 элементов ровна:" + (a + b + c + d));
//    }

