package InheritanceLesson;

// overloaded constructors;
public class KonstructorEx {
    KonstructorEx(String n, String s) {
        this.name = n;
        this.surname = s;
    }

    KonstructorEx(String n) {
        this(n, null);// может обратиться к оверлоадед конструктору класса, который ниже;
    }

    String name;
    String surname;
}

class Students extends KonstructorEx {
    //    Students() {
//        super("Petya");// обращение к предку конструктору;
//    }
    Students() {
        this(5);
        System.out.println("Hello!");
    }

    Students(int i) {
       super("Petya");

    }

    public static void main(String[] args) {
        Students s2 = new Students();
    }
}
