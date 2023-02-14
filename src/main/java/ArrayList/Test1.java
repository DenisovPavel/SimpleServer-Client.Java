package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student std = new Student();
        list.add(std);
        list.add(new StringBuilder("ok"));


        ArrayList<String> list2 = new ArrayList();//only string elements;
        list2.add("poka");

        ArrayList<StringBuilder> list3 = new ArrayList();
    }
}
    class Car {
    }
class Student{

}