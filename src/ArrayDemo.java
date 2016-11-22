/**
 * Created by Ryan on 11/21/16.
 */
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] array1 = {3, 3, 2, 1};
        int[] array2 = Arrays.copyOf(array1, array1.length);

        System.out.println("array1 values: ");
        for (int number : array1) {
            System.out.println(number);
        }
    }
}