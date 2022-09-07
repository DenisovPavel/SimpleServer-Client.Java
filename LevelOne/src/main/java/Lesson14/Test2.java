package Lesson14;

public class Test2 {
    public void time() {
        for (int hour = 0; hour <= 23; hour++) {
            for (int minute = 0; minute <= 59; minute++) {

                System.out.println(hour + ":" + minute);

            }
        }
    }

    public static void main(String[] args) {
        Test2 time = new Test2();
        time.time();
    }
    // часы и минуты в цикле for  по методу Time!
}