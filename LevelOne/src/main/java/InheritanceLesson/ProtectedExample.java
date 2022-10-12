package InheritanceLesson;

//   protected елементы видны внутри класса ,также видны в классах наследниках;
public class ProtectedExample {
    protected String name = "Kolya";
    protected static int salary = 150;

    protected void work() {
        System.out.println("Rabotat");
    }

    protected static void rest() {
        System.out.println("Otdixat!");
    }
}
 class Student1 extends ProtectedExample {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}


