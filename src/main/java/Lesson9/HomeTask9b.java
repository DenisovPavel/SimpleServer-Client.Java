package Lesson9;

public class HomeTask9b {
   int a = 1;
    static int b = 2;
  static  void abc(final int a){
        System.out.println(a);
        System.out.println(HomeTask9b.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}
