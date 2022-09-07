package Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("Воскресенье") {
            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                System.out.println("Рабочий день до 18:00");
                break;
            case "Суббота":
                System.out.println("Выходной первый");
                break;
            case "Воскресенье":
                System.out.println("Выходной второй");
                break;
            default:
                System.out.println("Ошибка дня!");

        }
    }
}
