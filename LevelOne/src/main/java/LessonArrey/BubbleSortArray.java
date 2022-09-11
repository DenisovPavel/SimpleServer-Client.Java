package LessonArrey;

import java.util.Arrays;

public class BubbleSortArray {

    public static void bubbleSort(int[] arrayToSort) {
        boolean isSorted = false;//булевый "флажок"который покажет когда массив отсортировался;
        while (!isSorted) {
            isSorted=true;
            for (int index = 1; index < arrayToSort.length; index++) {
                if (arrayToSort[index] < arrayToSort[index - 1]) {//если 1 элемент меньще предыдущего;
                    int temp = arrayToSort[index];//через 3 переменную меняем элементы местами;
                    arrayToSort[index] = arrayToSort[index - 1];
                    arrayToSort[index - 1] = temp;
                    isSorted = false;//сбрасывает вначало цикла пока элемнты все неотсортировались;
                }
            }
            System.out.println(Arrays.toString(arrayToSort));
        }
    }

    public static void main(String[] args) {
        int[] arrayUnsorted = {3, 12, -3, -9, 22, 86, -14, 10, 6, 17, -9, 0, -17};
      bubbleSort(arrayUnsorted);

    }
}
