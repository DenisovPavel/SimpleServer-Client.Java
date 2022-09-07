package Lesson13;

public class Student2 {
    int grade;

    Student2(int grade){
        this.grade=grade;
    }

    public static void main(String[] args) {
        Student2 st2 = new Student2(5);
        switch (st2.grade) {
//            case 1:
//                System.out.println("Некорректная оценка!");
//                break;
            case 2:
                System.out.println("Студент двоишник");
                break;
            case 3:
                System.out.println("Студент троишник");
                break;
            case 4:
                System.out.println("Студент хорошист");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println("Оценка не верна!");

        }
    }
}
