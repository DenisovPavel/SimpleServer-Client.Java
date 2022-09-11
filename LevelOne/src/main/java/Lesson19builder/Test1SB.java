package Lesson19builder;

class Car {
}

//StringBuilder;
public class Test1SB {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!");
        StringBuilder sb3 = new StringBuilder(50);//вместимость 50 символов;
        StringBuilder sb4 = new StringBuilder(sb2);
        System.out.println(sb2.length());
        System.out.println(sb4.length());// в свою очередь он показывает длину индексов sb2, но при этом это sb4;
        System.out.println(sb2.charAt(3));
        System.out.println(sb2.indexOf(" "));//указывает индекс "пробела",тут нельзя использовать char!
        String s = sb2.substring(5);
        System.out.println(s);//ответ "day"; с 5го индекса и до конца.
        String s2 = sb2.substring(0, 4);
        System.out.println(s2);// ответ "good" с 0 по 4 индекс.

        System.out.println(sb2.subSequence(0, 5));//метод StringBuilder(в стринг его нет)выводит char!
        //append(dataType dt)- StringBuilder;меняет сам стрингбилдер;

        sb2.append("today");
        System.out.println(sb2);//Good Day!!today - довались символы today;он изменил имеющийся стринг билдер обьект.

        sb2.append(sb2);
        System.out.println(sb2);//Good Day!!todayGood Day!!today (output);

        sb2.append(new Car());
        System.out.println(sb2);//Good Day!!todayGood Day!!today  "Lesson19builder.Car@43a25848"-обьект класса Car(новый)

        sb2.insert(4, "wonderful");
        System.out.println(sb2);// Goodwonderful Day!!todayGood Day!!todayLesson19builder.Car@43a25848(вставил wonderfull)

        StringBuilder sb5 = new StringBuilder("Good Wonderfull Day");
        System.out.println(sb5);

        sb5.delete(5, 16);
        System.out.println(sb5);//Good Day -удаляет индексы!;

        sb5.deleteCharAt(5);
        System.out.println(sb5);//Good ay - удалил char в стрингбилдере!

        sb5.reverse();
        System.out.println(sb5);//ya dooG - задом наперед!)))

        sb5.replace(0,7,"Good ay");
        System.out.println(sb5);//Good ay - меняет с опр.индекса по опр.индекс + "..." определенное вырожение!


        System.out.println(sb5.capacity());//выдает места в массиве для наших символов;- output sp5-35
    }
}
