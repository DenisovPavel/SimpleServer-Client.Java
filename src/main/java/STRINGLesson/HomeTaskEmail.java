package STRINGLesson;


public class HomeTaskEmail {
    static String mail = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";

    public static void printer(String email) {

        String[] emailArray = email.split(",");

        for (String word :emailArray) {

            System.out.println(word.substring(word.indexOf('@') + 1, word.indexOf('.')));
        }
    }

    public static void main(String[] args) {
printer(mail);
    }
}
