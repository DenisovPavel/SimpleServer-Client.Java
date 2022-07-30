package Lesson11HomeTask;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Blue", "V6", 4);
        System.out.println("До использования метода, кол-во дверей машины:" + " " + car1.doors);
        System.out.println("После использования метода, кол-во дверей машины:" + " " + car1.changeDoors(2));

        Car car2 = new Car("White", "V8", 3);
        System.out.println("До использования метода, кол-во дверей машины:" + " " + car2.doors);
        System.out.println("После использования метода, кол-во дверей машины:" + " " + car2.changeDoors(4));


        System.out.println("До использования метода, цвет  машины:" + " " + car1.color +" " + "мотор машины: " + car1.engine +" " + "кол-во дверей: " + car1.doors);
        Car.changeColor(car1,car2);
        System.out.println("После использования метода, цвет  машины:" + " " + car1.color +" " + "мотор машины: " + car1.engine +" " + "кол-во дверей: " + car1.doors);

        System.out.println("До использования метода, цвет  машины:" + " " + car2.color +" " + "мотор машины: " + car2.engine +" " + "кол-во дверей: " + car2.doors);
        Car.changeColor(car2,car1);
        System.out.println("После использования метода, цвет  машины:" + " " + car2.color +" " + "мотор машины: " + car2.engine +" " + "кол-во дверей: " + car2.doors);
//Использование обьекта в параметре метода,а также смена одного их параметров обьекта+ смена количества дверей автомобиля на примере одного метода;
    }
}


