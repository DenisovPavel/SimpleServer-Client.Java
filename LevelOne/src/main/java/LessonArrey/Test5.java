package LessonArrey;

public class Test5 {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array3[]= array2;
        System.out.println(array1==array2);//false,так как переменные ссылаются на разные обьекты;
        System.out.println(array1.equals(array2));// false;- метод не перезаписан;
        System.out.println(array3.equals(array2));// TRUE;
        System.out.println(array3==array2);// True;

    }
}

