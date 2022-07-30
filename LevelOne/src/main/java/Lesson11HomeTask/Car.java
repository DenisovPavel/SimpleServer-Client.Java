package Lesson11HomeTask;

public class Car {
    public String color;
    public String engine;
    public int doors;

    Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;

    }
    public int changeDoors(int d1){
        return  d1;
    }
    public static void changeColor(Car color1, Car color2){
    color1.color = "Blue";
    color2.color = "White";
    }
}




