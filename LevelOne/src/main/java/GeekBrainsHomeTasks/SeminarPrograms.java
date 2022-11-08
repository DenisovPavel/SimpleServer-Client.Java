package GeekBrainsHomeTasks;
public class SeminarPrograms {
    public static void Maximal_Element(int[] Array1) { // Немного изменил названия переменных,для личного удобства)
        int maximum = Array1[0];
        int count_maximal = 0;
        int iteration = 0;
        while (iteration < Array1.length) {
            if (Array1[iteration] > maximum) {
                maximum = Array1[iteration];
                count_maximal = 1;
            } else if (Array1[iteration] == maximum) {
                count_maximal = count_maximal + 1;
            }
            iteration++;
        }
        System.out.print(count_maximal);
    }
    public static void main(String[] args) {
        int[] numbers = {1, 8, 3, 8, 2, 6, 8, 8};
        Maximal_Element(numbers); //output-4!в данном случае в массиве 4 элемента имеющих макс.значение среди остальных)
    }
}

