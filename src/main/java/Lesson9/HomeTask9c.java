package Lesson9;

public class HomeTask9c {
    int a = 1;
    static int b =2;
    void abc (int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(HomeTask9c.b);
    }

    public static void main(String[] args) {
        HomeTask9c t1 = new HomeTask9c();
        t1.abc(4);
    }
}
