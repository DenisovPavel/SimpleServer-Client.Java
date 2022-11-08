package GeekBrainsHomeTasks;
// метод на максимальное значение в массиве и перенос его в правую часть.
public class Test3 {
    public static void MaxZnachenie(int[] Array) {
        int maxIndex = Array[0];
        int max = Array[maxIndex];
        int index = 0;
        int size = 6;

        while (index < size) {
            if (Array[index] > max) {
                maxIndex = index;
                max = Array[index];
            }
            Array[maxIndex] = Array[size - 1];
            Array[size - 1] = max;
            index++;
        }
        for (int i : Array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] Massiv = {2, 5, 13, 7, 6, 4};
        MaxZnachenie(Massiv);
    }
}
