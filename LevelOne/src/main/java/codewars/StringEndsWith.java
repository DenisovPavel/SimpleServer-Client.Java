package codewars;

public class StringEndsWith {

    public static void main(String[] args) {
        System.out.println(wordChecker("clock", "ck"));
    }

    public static boolean wordChecker(String first, String second) {
        boolean result = first.endsWith(second);
        return result;


    }

}
