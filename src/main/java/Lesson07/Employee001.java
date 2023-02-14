package Lesson07;

class Employee001 {
     int id;
     void ProPuSk001() {
        System.out.println("Пропуск клиента:" + "  " + id);
    }
     Employee001(int Id2) {
        id = Id2;
    }
    public static void main(String[] args) {
        Employee001 NewEmp1 = new Employee001(22);
        System.out.println("Идентификационный пропуск сотрудника:" + "  " + NewEmp1.id);
    }
}



