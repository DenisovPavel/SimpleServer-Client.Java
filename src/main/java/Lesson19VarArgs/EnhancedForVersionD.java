package Lesson19VarArgs;

public class EnhancedForVersionD {
    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {// j < array[i].length- это значит что сначало
//                // j = {3, 7, 8} , затем {4, 5} и в конце {9, 4, 4, 6, 8, 3}; каждому из элементов 2хмерного массива;
//                System.out.print(array[i][j] + " ");// System.out.print , а не println;
//            }
//        }
        for (int[] array2 : array) {//элементом 2мерного массива array является одномерный массив array2;
            for (int a : array2) { // a принял елементы array2;
                System.out.print(a + " ");
            }
        }
    }
}
