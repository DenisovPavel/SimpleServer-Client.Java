package Shometask18;

public class AnotherMetod {
    public static boolean ravenstvo2(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("Hello");
        StringBuilder sb5 = new StringBuilder("Hello");
        boolean a = ravenstvo2(sb3, sb4);
        boolean b = ravenstvo2(sb4, sb5);
        System.out.println(a);// false;
        System.out.println(b);// true;
    }
}
