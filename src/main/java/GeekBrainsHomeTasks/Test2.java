package GeekBrainsHomeTasks;

public class Test2 {
    public static void  SredneeArifmeticheskoe(int[] Array) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];
        }
        avg = sum / Array.length;
        System.out.print("SredneeArifmeticheskoe" + "=" + avg);
    }

    public static void main(String[] args) {
       int [] MassivChisel = {2,5,13,7,6,4};
        // int [] MassivChisel1 = {12,14,6,5,2,57,32,44}; // количество чисел = 8, общая сумма 172, 172 / 8 = 21
        SredneeArifmeticheskoe(MassivChisel);
    }
}


