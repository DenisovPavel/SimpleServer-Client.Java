package GeekBrainsHomeTasks;

import P1.A;

public class BubbleSort {
    public static void Bubble(int[] Array) {
        int sorted_size = 0; //отсортрованный массив
        int size = Array.length; // длина массива

        while (sorted_size < size - 1) { // пока отсортированный массив меньше длины массива -1
            int index = 0;// итерации с 0
            while (index < (size - 1 - sorted_size)) { // пока индекс меньше(длина массива - 1 - отсортированный массив)
                if (Array[index] > Array[index + 1]) { // если текущий элемент больше того который перед ним
                    int temp = Array[index];// идет замена их через 3ую переменную
                    Array[index] = Array[index + 1];
                    Array[index + 1] = temp;
                }
                index = index + 1; // счетчик +1
            }
            sorted_size = sorted_size + 1; // отсортированные элементы
        }
        for (int i : Array)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int[] numbers = {77, 46, 11, 89, 48, 14, 67, 73, 22, 26};
        Bubble(numbers);
    }
}
