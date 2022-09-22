package Lesson19VarArgs;

// Nested foreach loop`s
public class EnhancedForVersionС {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Popov"};
        String[] exams = {"Math analiz", "History"};
        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + "-" + s2);
            }// сначало s1 принимает значение Иванов затем идет Inner Loop далее sout;далее s1 пинимает Петров и тд;
        }
    }
}
