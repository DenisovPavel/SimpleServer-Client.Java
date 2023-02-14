package Lesson14;

public class Lesson14HomeTask {

    public static void time() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute <= 60; minute++) {
                INNER:
                for (int seconds = 0; seconds <= 60; seconds++) {
                    if (hour > 1)
                        break OUTER;
                    if (minute % 10 == 0)
                        break;
                    if (seconds * hour > minute)
                        continue MIDDLE;
                    System.out.println(hour + ":" + minute + ":" + seconds);
                }
            }
        }
    }

    public static void main(String[] args) {

        time();
    }
}

