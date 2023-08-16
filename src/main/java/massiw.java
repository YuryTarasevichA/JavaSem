import java.util.Arrays;
import java.util.Scanner;

public class massiw {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
//        int array [] = {1, 2, 8, 6, 3};
//        int size = array.length;
        int array [] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
//        System.out.println("Введенный массив:");
        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < size; i++) {
//            System.out.print(array[i] + " ");
//        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        int avarage = sum/size;
        System.out.println(avarage);
        for (int i = 0; i < size/2; i++) {
            int temp = array[i];
            array[i] = array[size-1-i];
            array[size-i-1] = temp;
        }
        System.out.println(Arrays.toString(array));


    }
}
