package Lesson15;

public class Test2 {
    //Пример с казино(ставка в казино пока есть деньги через цикл While
    public static void main(String[] args) {
        int money = 100;
        while(money>0){
            System.out.println("Делайте ставку!");
            System.out.println("Вы проиграли!");
            money= money-10;
        }
    }
}
