package massiw;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main (String[] args) {
        print();
    }
    public static void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int arr []  = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        array (arr, size);
    }

    public static void array (int [] arr, int size) {
        int first = arr[0];
        int second = arr[0];
        if (arr[1] > first) {
            first = arr[1];
        } else second = arr[1];
        for (int i = 2; i < size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println("Первое по величине: " + first);
        System.out.println("Второе по величине: " + second);
    }


}
