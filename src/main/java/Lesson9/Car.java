package Lesson9;

public class Car {
    String Color;
    String Engine;
    static int count;
     Car( String Color,String Engine){
         count++;
         this.Color=Color;
         this.Engine=Engine;
     }
     public void showColor(){
         System.out.println("Цвет машины:" + " " + Color);
     this.changeColor("blue");
     }
     public void changeColor(String Color3){
         System.out.println("Цвет машины изменился" );
         int cena = 5000;
         this.Color=Color3;
         cena +=1000;
     }
}
