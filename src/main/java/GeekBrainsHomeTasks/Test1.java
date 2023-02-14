package GeekBrainsHomeTasks;

public class Test1 {
    public static void MaxPositiveNumber(int[] Array) {
        int size = 6;
        int count = 0;
        int index = 0;
        while (index < Array.length) {
            if (Array[index] > 0) {
                count = count + 1;
            }
            index = index + 1;
        }
        System.out.println("MaxPositiveNumbers" + " " + "=" + " " + count + ";" );
    }

    public static void main(String[] args) {
        int[] ArrayExample = {-2, 8, 14, -34, -9, 7, 7, 4};
        MaxPositiveNumber(ArrayExample);
    }
}
