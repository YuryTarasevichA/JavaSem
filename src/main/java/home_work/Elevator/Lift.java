package home_work.Elevator;

import java.util.Scanner;

public class Lift {
    private static int minFloor = 1;
    private static int maxFloor = 10;
    private static int currentFloor = 1;

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в лифт!");

        Scanner scanner = new Scanner(System.in);
        int targetFloor;
        do {
            System.out.println("Введите номер этажа (от " + minFloor + " до " + maxFloor + "): ");
            targetFloor = scanner.nextInt();
        } while (!isValidFloor(targetFloor));

        move(targetFloor);

        System.out.println("Вы прибыли на " + currentFloor + " этаж.");
        scanner.close();
    }

    private static void move(int floor) {
        System.out.println("Лифт движется...");

        if (floor > currentFloor) {
            for (int i = currentFloor + 1; i <= floor; i++) {
                System.out.println("Этаж " + i);
            }
        } else if (floor < currentFloor) {
            for (int i = currentFloor - 1; i >= floor; i--) {
                System.out.println("Этаж " + i);
            }
        }

        currentFloor = floor;
        System.out.println("Лифт остановился на " + floor + " этаже.");
    }

    private static boolean isValidFloor(int floor) {
        return floor >= minFloor && floor <= maxFloor;
    }

}
