package Lesson4;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class lesson4task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> storage = new ArrayDeque<>();
        while (true) {
            String input = scanner.nextLine();
            if ("exit".equals(input)) {
                break;
            }
            if ("print".equals(input)) {
                System.out.println(storage);
            } else if ("revert".equals(input)) {
                storage.pollFirst();

            } else if ("stop".equals(input)) {
                break;
            } else {
                storage.addFirst(input);
            }
        }
        System.out.println("Программа завершена");
    }
}
