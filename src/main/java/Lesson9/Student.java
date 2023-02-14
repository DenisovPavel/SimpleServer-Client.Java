package Lesson9;

public class Student {

}
class StudentTest{
    public static void main(String[] args) {
      Student St1 = new Student();
      Student St2 = new Student();
      Student St3;
      St1 = null;// В данном примере мы просто удалили адрес обьекта
   St1 = new Student();//далее мы присвоили обьекту новый адрес!
    }
}