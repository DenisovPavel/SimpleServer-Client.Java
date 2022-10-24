package GeekBrainsHomeTasks;
public class ForGeekBrainsTask {
    static double sum = 0;// сумма элементов массива;
    static double avg;// эта переменная среднее арифметическое исходя из условия;
// numbers = {2, 5, 13, 7, 6, 4}; опускаю в метод main;
    public static void srednee_Arifmeticheskoe(double[] array) {

        for (int i = 0; i < array.length; i++) {// вмеcто индекса взял - I, привычнее для итераций =)
            sum = sum + array[i];
        }
        avg = sum / array.length;
        System.out.println("Srednee arifmeticheskoe :" + " " + avg);
    }
    public static void main(String[] args) {
       double[] numbers = {2, 5, 13, 7, 6, 4};
        System.out.println("Kolichestvo elementov massiva:" + " " + numbers.length);
        srednee_Arifmeticheskoe(numbers);
    }//Я решил что на псевдокоде не интересно,поэтому написал так=)немного изменил данные из условия для красоты кода=)
}// Также в параметрах указал значение для более точного определения числа в output:  6.166666666666667
