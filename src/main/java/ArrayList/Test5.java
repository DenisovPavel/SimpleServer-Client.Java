package ArrayList;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1, "pokemon");
        for (String sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println(list.indexOf("poka"));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

    }
}
