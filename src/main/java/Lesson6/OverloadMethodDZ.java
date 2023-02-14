package Lesson6;

public class OverloadMethodDZ {
    int MetOver(int i1) {
        return i1;
    }

    int MetOver(int i1, int i2) {
        return i1 + i2;
    }

    int MetOver(int i1, int i2, int i3) {
        return i1 + i2 + i3;
    }

    int MetOver(int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3 + i4;
    }
}






















//    int Method1(int i1) {
//        return i1 + i2;
//    }
//
//    int Method1(int i1, int i2) {
//       return i1 + i2;
//    }
//   int Method1(int i1, int i2, int i3) {
//        return  i1 + i2 + i3;
//    }
//    int Method1(int i1, int i2, int i3, int i4) {
//        return  i1 + i2 + i3 + i4;
//    }
//}
//
//class OverLoadMethodDZTest {
//    public void main(String[] args) {
//        OverloadMethodDZ Method2 = new OverloadMethodDZ();
//        int Otvet1 = Method2.Method1(Method2.i1, Method2.i2);
//        int Otvet2 = Method2.Method1(Method2.i1, Method2.i2, Method2.i3);
//        int Otvet3 = Method2.Method1(Method2.i1, Method2.i2, Method2.i3, Method2.i4);
//
//        int i1 = 0;
//        int i2 = 1;
//        int i3 = 2;
//        int i4 = 3;
//
////        System.out.println("Сумма двух чисел:" + " " + Otvet1);
////        System.out.println("Сумма трех чисел:" + " " + Otvet2);
//        System.out.println("Сумма четырех чисел:" + " " + Otvet3);
//    }
//}

