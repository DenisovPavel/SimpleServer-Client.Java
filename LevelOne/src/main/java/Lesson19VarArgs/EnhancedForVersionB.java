package Lesson19VarArgs;

public class EnhancedForVersionB {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        int summa = 0;
        for (int a : array) {// переменная "а" очереди принимает значения всех элементов массива array и складывает
            // со значением "summa";
            summa += a;
        }
        System.out.println(summa);//11
    }
}
