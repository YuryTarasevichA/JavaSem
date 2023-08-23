package home_work.Elevator;

import java.util.Scanner;

public class ElevFloorMoving {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Scanner scanner = new Scanner(System.in);
        boolean result;
        int maxFloor;
        int minFloor;
        int currentFloor;
        do {
            System.out.println("Введите минимальный этаж лифта: ");
            elevator.setMinFloor(scanner.nextInt());
            System.out.println("Введите максимальный этаж лифта: ");
            elevator.setMaxFloor(scanner.nextInt());
            System.out.println("Введите этаж на котором находится лифт: ");
            elevator.setCurrentFloor(scanner.nextInt());
            maxFloor = elevator.getMaxFloor();
            minFloor = elevator.getMinFloor();
            currentFloor = elevator.getCurrentFloor();
            result = elevator.lift(minFloor, maxFloor, currentFloor);
            if (!result) {
                System.out.println ("Ошибка: максимальный этаж должен " +
                        "быть больше минимального или указанный этаж не входит в диапазон этажей");
            }
        } while (!result);


        System.out.println("Введите этаж на который хотите поехать");
        elevator.move(scanner.nextInt());
    }


}
