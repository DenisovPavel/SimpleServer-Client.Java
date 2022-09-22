package codewars;

public class Main {
    public static void main(String[] args) {
        boolean bool = checker("mama", "u");
        System.out.println(bool);

    }

    public static boolean checker(String first, String second) {

        return first.endsWith(second);
    }
}
