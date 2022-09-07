package Lesson15;

public class Test9 {
    public static void main(String[] args) {
        int hour = 0;
            OUTER:
                  do {
                         int minute = 0;

            INNER:
            while (minute < 60) {
                    System.out.println(hour + ":" + minute);
                        minute++;
            }
                                        hour++;
            }

              while (hour < 24);
// минута =0,затем начинается работа inner loop;когда минута =60,получается false и цикл inner заканчивается! действие переходит дальше вниз!
    }
}