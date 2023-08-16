import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class million_massive {
    public static void main (String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 1000);
        }
        System.out.println(arr[4]);
        System.out.println(Arrays.toString(arr));

        int indexToRemove = 0;
        int [] arr1 = new int[arr.length - 1];
        int j = 0;
        for (int i = indexToRemove; i < arr.length; i++) {
            if (i!=indexToRemove) {
                arr1 [j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(System.nanoTime());
//        long startTime = System.nanoTime();  // ... the code being measured ...  long elapsedNanos = System.nanoTime() - startTime;
    }
}
