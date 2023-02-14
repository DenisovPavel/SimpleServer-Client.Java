package Lesson04;
 class Student {
         public static void main(String[] args) {

         }
         int id;
         String name;
         String surname;
         int year;
         double midMath;
         double midEcon;
         double midEng;

         Student(int id1, String name1, String surname1, int year1, double midMath1, double midEcon1, double midEng1) {
                 id = id1;
                 name = name1;
                 surname = surname1;
                 year = year1;
                 midMath = midMath1;
                 midEcon = midEcon1;
                 midEng = midEng1;
         }
         Student( int id2, String name2, String surname2,int year2){
                 id=id2;
                 name=name2;
                 surname=surname2;
                 year=year2;
         }
         Student() {
         }
 }

//
//    @Override
//    public String toString() {
//        return "Средняя арифметическая оценка" + " " + name + " " + surname + "=" + (midMath + midEcon + midEng) / 3;
//    }
//
//    public double getMiddle() {
//        return (midMath + midEcon + midEng) / 3;
//    }
//
//    public static class Main {
    //
    //    // 128 64 32 16 8 4 2 1
    //
    //    public static void main(String[] args) {
    //        // System.out.println("Привет");
    ////        byte b1 = 12;
    ////        byte b2 = 0B1100;
    ////        System.out.println(b2);
    //        System.out.println("мама привет!");
    //
    ////        short s1 = -1300;  // decimal
    //        short s2 = -0x514;  // hexadecimal
    //        short s3 = -02424;  // octal
    //        short s4 = -0b10100010100;  // binary
    //
    //        System.out.println(s2);
    //        System.out.println(s3);
    //        System.out.println(s4);
    //        int i1 = 0;
    //        int i2 = 0x0;
    //        int i3 = 00;
    //        int i4 = 0b0;
    //System.out.println(i4);
    //        long l1 = 123456789;
    //        long l2 = 0x75BCD15;
    //        long l3 = 0726746425;
    //        long l4 = 0b111010110111100110100010101;
    //        System.out.println(l4);
    //        float f1 = 2.5f;
    //        float f2 = 5.6f;
    //        System.out.println(f1);
    //        System.out.println(f2);
    //        double d1 = 33.22;
    //        double d2 = 22.33;
    //        System.out.println(d1);
    //        System.out.println(d2);
    //
    //
    //        // %s - String, %d - digit, %f - float, double
    //        for (int i = 0; i < 10; i++) {
    //            System.out.printf("Hello %d!!!\n", i);
    //        }
            //System.out.printf("My name is %s!!!\n", "Pasha");
            //    /n   - перенос курсора на другую строку.

            // сила тяжести на луне состовляет около 17% земной.Напишите программу которая вычеслила бы ваш вес на луне.
            // G1 земли = 9,8. G2  луны = 1,6; M1 тела = 70 кг; F луны = F земли * 17 %;

            // double g1 = 9.8;
            // double g2 = 1.6;
            // int m1 = 70;
            //int Z = 17;
            //double f = m1*g1;
            // System.out.println(f);

    //        int i1 = 5;
    //         int i2 = 11;
    //        double D1 = 5.5;
    //        double D2 = 1.3;
    //        long L = 20l;
    //        double result = 0;
    //        result = i2 / d1 + d2 % i1 - L;
    //         System.out.println(result);

    //       int a1 = 5;
    //        int b1 = a1-- - --a1 + ++a1 +a1++ +a1;
    //        System.out.println(b1);
    //
    //        int y1 = 8;
    //        int x1 = ++y1 - y1++ + ++y1 - --y1;
    //        System.out.println(x1);
//        }
//}
//// сноска mid - middle указывает на среднее значение определнного предмета(математика,экономика и английский);






