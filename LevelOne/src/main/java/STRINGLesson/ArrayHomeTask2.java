package STRINGLesson;
// метод выводящий 2мерный массив в консоль при помощи импорта Arrays;
import java.util.Arrays;

public class ArrayHomeTask2 {
    public static void showArray(String[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public static void main(String[] args) {
        String[][] example = {{"Elem1", "Elem2"}, {"Elem3"}, {"Elem4", "Elem5"}};
        showArray(example);

    }
}
