package Lesson8;

public class FinaleTest {
    public  int a1;
    FinaleTest(){
a1 = 10;
    }
//    FinaleTest (boolean B1) {a1=15;
//    }
    // в  данном случае при создании 2х оверлодед конструктаров нужно определять переменную(придавать ей значение)



    public static void main(String[] args) {
        FinaleTest T1 = new FinaleTest();
        T1.a1 = T1.a1 * 2;
        System.out.println(T1.a1);
        // Если перед переменной а1 поставить "Final" то значение переменной будет ReadOnly!
        // То есть только читабельной!( public final int a1 = 20; -java: cannot assign a value to final variable a1,
        // переменная приобретает значение "Константы"(у них нет дефолтного значения);
    }
}
