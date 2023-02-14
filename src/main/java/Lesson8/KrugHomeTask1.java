package Lesson8;

public class KrugHomeTask1 {
    public final static double P = 3.14;

     public static double ploshad(double Radius) {
     double S1 = P * ( Radius * Radius);
        return S1;

    }
    static double dlina(double Radius2) {
       double Length = 2 * (P * Radius2);
       return Length;

    }
      public void radius(double Radius3){
            System.out.println("Радиус круга состовляет:" + " " + Radius3);
            System.out.println("Площадь круга состовляет:" + " " + ploshad(Radius3));
            System.out.println("Длина окружности ровна:" + " " + dlina(Radius3));
        }

}
