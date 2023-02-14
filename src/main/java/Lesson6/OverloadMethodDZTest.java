package Lesson6;

public class OverloadMethodDZTest {
        static OverloadMethodDZ MetOverload = new OverloadMethodDZ();

        public static void main(String[] args) {

            int Otvet1 = MetOverload.MetOver(0);

            int Otvet2 = MetOverload.MetOver(0, 1);

            int Otvet3 = MetOverload.MetOver(0, 1, 2);

            int Otvet4 = MetOverload.MetOver(0, 1, 2, 3);

            System.out.println(Otvet1);
            System.out.println(Otvet2);
            System.out.println(Otvet3);
            System.out.println(Otvet4);
        }
}
