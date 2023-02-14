package ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class TestIterator {


//    some code
//    .......
//    Iterator<Data Type> nameiterator =ArrayList.Iterator();
//    while(nameiterator.hasNext())
//        System.out.println(iterator.next());

    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s4);
        list1.add(s3);
        list1.add(s2);
        Iterator<String> it = list1.iterator();// povtoritel'povtoryaet iteration
    while(it.hasNext()){
       it.next();//tot ze foreach,probegaet po elementam
       it.remove();// tut udalyaet element

    }
    }
}