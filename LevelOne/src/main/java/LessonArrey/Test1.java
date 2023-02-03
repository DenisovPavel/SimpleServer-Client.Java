package LessonArrey;

public class Test1 {
    public static void main(String[] args) {
        int[] array1;
        String[] array2;
        double[][] array3;
        int[][] array10;
        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[4][2];// в четырех одномерных массивах будет по 2 элемента;
        array10 = new int[3][];// если колличество элементов внутри одномерного массива отличается -
        // к примеру array 10 = { { 5,3,6,10},{ 1 },{1,7} };
        System.out.println(array3.length);// длина массива.length  это не метод!а атрибут класса;

        // Initialisation of arrays:
        array2 [0]=" privet";
        array2[1]= "poka";
        array2[2]= "ok";

        array3[0][0]=3.14;
        array3[2][1]= 4.15;

        double[]array5;// static Initialisation
        array5 = new double[2];// присвоили 2 элемента типа double;
        array5[0]=2.5; // инициализировали первый элемент;
        array5[1]=3.5; // инициализировали второй элемент;
        array3[1]= array5;// присвоили 3 массиву 2 элемента массива 5(так как длины массива 3 и 5 одинаковы в индексе [1][0] );
        System.out.println(array3[1][0]);

//        double[][] array4 = { {2.4,5.6,7.8,3,5} ,{ 2.4,5.6,5.7,8.9,3.6 } };
//


        // Важный момент: int [] array0, a; - два массива: 1- array0 ; 2- a;
        // int array20 [], b; - массив array20 и переманная b типа данных int;
        // int [] array21, array22 [][]; 2 массива: array21-одномерный массив; array22- трехмерный массив;
        // int  array21 [], array22 [][]; 2 массива: array21-одномерный массив; array22- ДВУхМЕРНЫЙ массив;
        }
}

