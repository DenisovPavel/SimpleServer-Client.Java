package Lesson9;

public class Bike {
    String сolor  ;
    String engine;
    String style;
    double speed;

    void showBike(String color, String engine, String style, double speed) {
        System.out.println("Цвет мотоцикла:" + " " + color + " " + "Тип Двигателя:" + " " + engine + " " + "Тип мотоцикла:" + " " + style + " " + "Скорость мотоцикла:" + " " + speed);
    }

    public void changeBike(String color2, String engine2, String style2, double speed2) {
        this.сolor= color2;
        this.engine = engine2;
        this.style = style2;
        this.speed = speed2;

        System.out.println("Цвет мотоцикла изменился:" + " " + color2 + " " + "Тип Двигателя поменялся:" + " " + engine2 + " " + "Тип мотоцикла изменился:" + " " + style2 + " " + "Скорость мотоцикла поменялась:" + " " + speed2);
    }
}
