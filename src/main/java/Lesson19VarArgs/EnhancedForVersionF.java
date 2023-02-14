package Lesson19VarArgs;

public class EnhancedForVersionF {
    public static void main(String[] args) {
        int[] array = new int[4];
        for(int b:array){
             b = 10; // с помощью foreach loop мы не можем проводить динамическую инициализацию массива;
        }
        for (int a : array) {
            System.out.print(a + " ");// 0 10 20 30
        }
    }
}
