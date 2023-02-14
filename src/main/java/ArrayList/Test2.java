package ArrayList;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1, "pokemon");
        list.set(0, "buy");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.get(1));
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list.addAll(list2);
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}