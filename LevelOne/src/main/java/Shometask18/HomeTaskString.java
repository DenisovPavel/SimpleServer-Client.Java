package Shometask18;

import java.util.Arrays;

public class HomeTaskString {

    public static void getMails(String email) {
        Integer startIndex = null;
        Integer endIndex = null;
        String[] words = email.split(";");
//        System.out.println(Arrays.toString(words));
//        System.out.println(words[0] + " первый элемент массива");
        for (String word : words) {
//            System.out.println(word);
            for (int i = 0; i < word.length(); i++) {
//                System.out.println(word.charAt(i));
                if (word.charAt(i) == '@') {
                    startIndex = i + 1;
                }
                if (word.charAt(i) == '.') {
                    endIndex = i;
                }
            }
            System.out.println(word.substring(startIndex, endIndex));
        }
    }
}

// Второй вариант переноса мейла:
//
//        for (String word : mail.split("; ")) {
//            int startIndex = word.indexOf("@");
//            int endIndex = word.indexOf(".");
//            System.out.println(word.substring(startIndex + 1, endIndex));

//Третий вариант переноса мейла:

//public static void email(String s){
//    int a = 0;// позиция символа '@'
//    int b = 0;// позиция символа '.'
//    int c = 0;// позиция символа ';'
//    while ((c<s.length()-1)){
//        a= s.indexOf('@',c);
//        b = s.indexOf('.',c);
//        c= s.indexOf(';',c+1,b);
//        System.out.println(s.substring(a+1,b));





