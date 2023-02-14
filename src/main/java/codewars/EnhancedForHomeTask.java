package codewars;

// метод который содержит в себе foreach конструкцию;
public class EnhancedForHomeTask {
    static String[] names = {"Misha", "Kostya", "Petya", "Ivan"};

    public static void abc(String... array) {
        for (String array2 : array) {
            System.out.print(array2 + " ");
        }
    }
    // в main если параметры метода abc = аргументам String[] args, тогда  args принимают значение null;
    public static void main(String[] args) {
        System.out.println("Argument count: " + args.length);
        abc(names);
        for (int i = 0; i < args.length; i++) {
            for (String arg : args) {
                if (args != names) {
                    System.out.println(args);
                } else
                    args[i] = null;
            }
        }
    }
}




