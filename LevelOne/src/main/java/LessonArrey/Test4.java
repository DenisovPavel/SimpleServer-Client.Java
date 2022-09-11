package LessonArrey;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};


        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");                    //1 9 3 -8 0 5 4 1
        }
        System.out.println();// с новой строки;
                                                                                // Метод sort(array);сортирует массив;
        Arrays.sort(array1);// Arrays(вызываем из импорта)+метод sort(внутри наш массив)+далее цикл;
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");                   // -8 0 1 1 3 4 5 9
        }

                                              // Метод binarySearch(array,value);Поиск опр.значения в опрд-ом массиве;
                                              //Он работает корректно только тогда,когда массив уже отсортирован;
        System.out.println();
        int index1 = Arrays.binarySearch(array1,-8);
        // назначили переменной index1 - индекс элемента -8 массива array1;
        System.out.println(index1); // индекс элемента -8 = 0;

        int index2 = Arrays.binarySearch(array1,5);
        System.out.println(index2);// индекс элемента 5 = 6;



    }
}
