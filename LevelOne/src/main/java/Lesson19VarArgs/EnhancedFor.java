package Lesson19VarArgs;

// Enhanced For = foreach;используют для работы с массивами и коллекциями;
public class EnhancedFor {
    public static void main(String[] args) {
        int[] array = {0, 4, 6, 1};
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();

    }
}
