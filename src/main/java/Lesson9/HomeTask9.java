package Lesson9;

public class HomeTask9 {
    int a = 1;
 static  int A = 2;
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        HomeTask9 t1=new HomeTask9();
        t1.abc(3);
    }
}
