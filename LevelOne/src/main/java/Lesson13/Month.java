package Lesson13;

public class Month {

    public void showNumber(int number) {
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Количество дней в месяце 31 и порядковый номер месяца:" + " " + number);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Количество дней в месяце 30 и порядковый номер месяца:" + " " + number);
                break;
            case 2:
                System.out.println("Количество дней в месяце 28 и порядковый номер месяца:" + " " + number);
                break;
            default:
                System.out.println("Внимание! НЕВЕРНЫЙ ввод порядкового номера месяца!");

        }
    }
}