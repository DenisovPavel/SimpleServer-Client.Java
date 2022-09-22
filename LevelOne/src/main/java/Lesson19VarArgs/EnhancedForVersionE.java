package Lesson19VarArgs;

public class EnhancedForVersionE {
    public static void main(String[] args) {

        int[] array = {9, 2, 4, 6};
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = 3;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");//3 3 3 3
//        }
//

        for (int a : array) {
            a = 3;
        }
        for (int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");//9 2 4 6  нельзя изменить значение примитивных типов данных;
            // вывод такой -> с помощью методов, мы можем менять само значение !как с примитивными типами та и с другими
            // включая String && StringBuilder;
        }
    }
}
