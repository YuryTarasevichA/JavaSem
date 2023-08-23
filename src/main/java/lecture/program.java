package lecture;

import java.util.Arrays;
import java.util.Scanner;

public class program {
    static int sum (int a, int b) {
        return a+b;
    }
    static double factor (int n) {
        if (n == 1) return 1;
        return n * factor(n-1);
    }
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5, 77};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10;
        }
        for (int item: arr) {
            System.out.println(item);
        }
        
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 != 0) break;
//            System.out.println(i);
//        }
//        int value = 321;
//        int count = 0;
//
//        do {
//            value /= 10;
//            count ++;
//        } while (value !=0);
//        System.out.println(count);
//        while (value != 0) {
//            value /= 10;
//            count ++;
//        }
//        System.out.println(count);

//        Scanner scanner = new Scanner(System.in);
//        int mounth = scanner.nextInt();
//        String text = "";
//        switch (mounth) {
//            case 1:
//                text = "Январь";
//                break;
//
//            default:
//                text = "Февраль, Март, Апрель, Май... ";
//                break;
//        }
//        System.out.println(text);
//        scanner.close();

//        int a = 4;
//        int b = 9;
//        int min = a < b ? a : b;
//        System.out.println(min);
//        int c = 0;
//
//        if (a > b) c = a + 1;
//        if (b > a) c = b - 1;
//        if (b == a) c = a + b;
//        System.out.println(c);

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        String s = "ahsdbaj";
//        char c = s.charAt(1);
//        System.out.println(c);

//        boolean f = 123 > 234;
//        System.out.println(f);
//        boolean f = 123 >= 234;
//        System.out.println(f);
//        boolean f = 123 <= 234;
//        System.out.println(f);
//        boolean f = 123 != 234;
//        System.out.println(f);
//        boolean f = 123 == 234;
//        System.out.println(f);
//        boolean f = 123 < 234;
//        System.out.println(f);

//        int a = 18; // 10010
////        a = a << 1;
//        System.out.println(a >> 1);

//        int arr [] = new int [10];
//        System.out.println(arr.length);
//        arr [2] = 13; // присваивание по индексу
//
//        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
//        System.out.println(Arrays.toString(arr)); // распечатать массив

//        arr = new int [] {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(arr.length);

//        int [] arr [] = new int[5][5];
//        for (int[] line : arr) {
//            for (int item : line) {
//                System.out.printf("%d", item);
//            }
//            System.out.println();
//        }
//        int [] arr [] = new int[5][5];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%d", arr[i][j]);
//            }
//            System.out.println();
//        }
//        String s ="dfjsnif";
//        int a = 123;
//        String q = s + a;
//        System.out.println(q);
//        static void sayHi () {
//            System.out.println("hi");
//    }
        lib.sayHi();
        System.out.println(sum(4, 8));
        System.out.println(factor(5));

    }


}
