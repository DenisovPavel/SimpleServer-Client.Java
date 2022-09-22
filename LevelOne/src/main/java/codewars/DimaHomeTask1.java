package codewars;
// dima podkinul prikol=)
public class DimaHomeTask1 {
    static String voin = "the-stealh-warrior;";
    public static void printer(String boez) {
        String input = boez;
        String output = " ";
        String[] words = input.split("-");
        for (String word : words) {
            String pervay = word.substring(0, 1).toUpperCase();
            String vse = word.substring(1);
            output = pervay + vse;
            System.out.print(output);
        }
    }
    public static void main(String[] args) {
        printer(voin);

    }
}

