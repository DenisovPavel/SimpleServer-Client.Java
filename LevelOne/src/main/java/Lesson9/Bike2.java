package Lesson9;

public class Bike2 {
    public static void main(String[] args) {

        Bike naked = new Bike();
        naked.showBike("Серый", "Двухцилиндровый", "Нейкд", 100);
        naked.changeBike("Белый", "Восемьсот-кубовый", "Спорт", 120);
        Bike turist = new Bike();
        turist.changeBike("Красный", "Литровый", "Турист", 115.5);
        Bike sportturist = new Bike();
        sportturist.changeBike("Фиолетовый", "Двух-литровый", "Спортивно-Туристический", 180.5);
        Bike croise = new Bike();
        croise.changeBike("Черный", "Два с половиной литра", "Круизер", 120.5);
        Bike chopper = new Bike();
        chopper.changeBike("Синий", "Литровый", "Чоппер", 100);
        Bike classic = new Bike();
        classic.changeBike("Металлик", "Двух-Литровый", "Классический", 120.5);
        Bike triple = new Bike();
        triple.changeBike("Черный", "Восемьсот-кубовый", "Тройка(с коляской)", 90);
        Bike cross = new Bike();
        cross.changeBike("Желтый", "Литровый", "Кроссовый", 120.5);

        turist=null;
        sportturist=null;
        croise=null;
        chopper=null;
        classic=null;
        triple=null;
    }
}
