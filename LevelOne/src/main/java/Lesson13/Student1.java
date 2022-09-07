package Lesson13;

public class Student1 {
    double grade;
    Student1(double grade){
        this.grade=grade;
    }

    public static void main(String[] args) {
        Student1 st1= new Student1(3);
        if (st1.grade == 2) {
            System.out.println("Студент двоишник!!!");
        } else if (st1.grade==3) {
            System.out.println("Студент троишник!!!");
        }
        else if (st1.grade==4){
            System.out.println("Студент хорошист)");
        }
        else if (st1.grade==5){
            System.out.println("Студент отличник=)");
        }
        else{
            System.out.println("Оценка не верная!!!");
        }
    }
}
