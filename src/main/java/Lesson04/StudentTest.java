package Lesson04;

public class StudentTest {
    public static void main(String[] args) {


        Student Sasha = new Student(10, "Aleksandr", "Popov", 2006, 4, 4, 3);
        Student Misha = new Student(12, "Mikhail", "Petrov", 2003);
        Student Jora = new Student();
        System.out.println(Sasha.name);
        System.out.println(Misha.name);
    }
}

//            Misha.id = 12;
//            Misha.name = "Mihail";
//            Misha.surname = "Petrov";
//            Misha.year = 2003;
//            Misha.midMath = 3;
//            Misha.midEcon = 3;
//            Misha.midEng = 4;
//
//            Jora.id = 14;
//            Jora.name = "Egor";
//            Jora.surname = "Ivanov";
//            Jora.year = 2001;
//            Jora.midMath = 5;
//            Jora.midEcon = 5;
//            Jora.midEng = 4;



//            System.out.println("Средняя арифметическая оценка" + " " + Sasha.name + Sasha.surname + "=" + (Sasha.MidMath + Sasha.MidEcon + Sasha.MidEng) / 3);
//            System.out.println("Средняя арифметическая оценка" + " " + Misha.name + Misha.surname + "=" + (Misha.MidMath + Misha.MidEcon + Misha.MidEng) / 3);
//            System.out.println("Средняя арифметическая оценка" + " " + Jora.name + Jora.surname + "=" + (Jora.MidMath + Jora.MidEcon + Jora.MidEng) / 3);

//        System.out.println(Misha);
//        System.out.println(Sasha);
//        System.out.println(Jora);
//
//        System.out.println(Misha.getMiddle());
//
//    }
//}




