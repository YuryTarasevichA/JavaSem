package lesson1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MainClassFromLessonOne {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));*/
        ex3();
//        Collections.reverse(list);
    }

    private static void ex2() {
        int[] arr = {1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0};
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
        }
        for (int num : arr) { //итератор, for-each
            if (num == 1) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 0;
            }
        }
        System.out.printf("Max length 1: %s%n", Math.max(currentLength, maxLength));
    }

    private static void ex3() {
        Random random = new Random();
        int[] arr = new int[20];
        final int VAL = 3;

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(1, 6);
        }

        System.out.println(Arrays.toString(arr));


        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
             if (arr[right] == VAL) {
                right--;
            } else if(arr[left] == VAL) {
                arr[left] = arr[right];
                arr[right] = VAL;

                right--;
                left++;
            } else if (arr[left] != VAL) {
                left++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
