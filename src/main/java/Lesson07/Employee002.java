package Lesson07;

 public class Employee002 {
     public  String Surname;

      void FaMilia() {
         System.out.println("Фамилия клиента:" + "  " + Surname);}
      public Employee002(String Surname02) {
         Surname = Surname02;
     }
     public static void main(String[] args) {
         Employee002 NewEmp2 = new Employee002("Petrov");
         System.out.println("Фамилия сотрудника:" + "  " + NewEmp2.Surname);
     }
 }








