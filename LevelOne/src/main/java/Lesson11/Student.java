package Lesson11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    public static void changeName(Student s3) {
        s3.name = "Vasiliy";
    }


    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);

        if (st1 == st2) {
            System.out.println("Студенты ровны между собой!");
        } else {
            System.out.println("Студенты НЕ ровны  между собой!");
        }

if (st1.name==st2.name){
    System.out.println("Имена студентов ровны между собой!");}
    else if (st1.name!= st2.name)
    System.out.println("Имена студентов не совпадают!");

    if (st1.course==st2.course){
        System.out.println("Год(Курс) обучения студентов совпадает!");}
    else if (st1.course!= st2.course)
        System.out.println("Год(Курс) обучения студентов не совпадает!");

    if(st1.grade== st2.grade){
            System.out.println("Средняя оценка студентов совпадает!");}
    else if (st1.grade!= st2.grade)
        System.out.println("Средняя оценка студентов не совпадает!");

}
    }




//        changeName(st2);
//        System.out.println(st2.name);






