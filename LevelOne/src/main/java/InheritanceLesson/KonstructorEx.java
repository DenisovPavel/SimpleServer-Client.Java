package InheritanceLesson;
// overloaded constructors;
public class KonstructorEx {
//    KonstructorEx(String n, String s) {
//        this.name = n;
//        this.surname = s;
//    }
//        KonstructorEx(String n) {
//            this(n, null);
//        }
//
//    String name;
//    String surname;
//}
//

    String name;
  String surname;
}

class Students extends KonstructorEx{
    Students(){
        super();// обращение к предку конструктору;
    }
    public static void main(String[] args) {
        Students s2 = new Students();
    }

}
