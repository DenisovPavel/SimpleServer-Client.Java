package Lesson11;

public class Student {
    public String name;
    public int course;
   public double grade;

   public  Student(String name, int course, double grade) {
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
    public static void toCampare (Student st1,Student st2){
        if (st1.name.equals(st2.name) && st1.course==st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты ровны, курс и оценки совпадают по первому методу!");
        } else {
            System.out.println("Студенты НЕ ровны  между собой по всем параметрам первого метода!");
        }
    }

    public static void toCompare2(Student st1, Student st2){
        if (st1.name == st2.name) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена студентов, курс и оценки  ровны между собой!*");
                } else
                    System.out.println("Имена студентов и Год(Курс) обучения совпадют, но Средняя оценка  не совпадает!*");

            } else
                System.out.println("Имена студентов ровны, но Год(Курс) обучения студентов не совпадает!*");

        } else
            System.out.println("Имена студентов, Год(Курс) обучения ,Средняя оценка  не совпадает!");
    }
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1, 9.5);
        Student st2 = new Student("Ivan", 1, 5.3);

        toCampare(st1, st2);
        toCompare2(st1,st2);
}
    }




//        changeName(st2);
//        System.out.println(st2.name);






