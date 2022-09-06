package LessonArrey;
//Christmas is coming and many people dreamed of having a ride with Santa's sleigh.
//        But, of course, only Santa himself is allowed to use this wonderful transportation.
//        And in order to make sure, that only he can board the sleigh, there's an authentication mechanism.
//        Your task is to implement the authenticate() method of the sleigh,
//        which takes the name of the person, who wants to board the sleigh and a secret password.
//        If, and only if, the name equals "Santa Claus" and the password is "Ho Ho Ho!"
//        (yes, even Santa has a secret password with uppercase and lowercase letters and special characters :D),
//        the return value must be true.Otherwise it should return false.
public class MarryChristmas {
    static String name1 = "Santa Claus";
    static String password1 = "Ho-Ho-Ho";
    public static boolean authenticationSleigh(String name, String password) {
        return (name1.equals(name) && password1.equals(password));
    }
    public static void main(String[] args) {
        authenticationSleigh("Clop", "hi-hi-hi");
        System.out.println("Wrong name & password=(");
        authenticationSleigh("Santa Claus", "Ho-Ho-Ho");
        System.out.println("Santa, welcome to Christmas's sleigh=)");
    }
}
