package LessonArrey;

// метод на который принимает массив и ыводит на эерн его наибольший и наименьший элемент;
public class Test6 {
    public static void maxMin(double[] array) {
        double max = array[0]; //максимальный элемент приравнимаем к первому элементу массива по индексу 0;
        double min = array[0]; //минимальный элемент приравнимаем к первому элементу массива по индексу 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("минимальный элемент массива:"+ min);
        System.out.println("максимальный элемент массива:"+ max);
    }

    public static void main(String[] args) {
        double [] array1 = {1.05,-3.14,8.0,9.19,-3,0};
        maxMin(array1);
        maxMin(new double[]{2.5,-1.3});
    }
}