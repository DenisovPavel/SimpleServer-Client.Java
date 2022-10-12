package Lesson21GarCollector;
// примеры;
public class Test1 {
    int abc() {
        return 5;// метод который просто возвращает 5 и не принимает никаких парам-ов;
    }

    int abc2(int i) {
        if (i > 10)
            return 5;
        else {
            return 10;
        }
    }
    void abc3(int i2){// метод который ничего не возвращает с return;
        if (i2>3){
            return;
        }
    }
    public static void main(String[] args) {
        int a = new Test1().abc();
        new Test1().abc();
    }
}
