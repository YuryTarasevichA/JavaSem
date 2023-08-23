package home_work.Elevator;

public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;
    private boolean isMoving;
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void setCurrentFloor (int currentFloor) {
        this.currentFloor = currentFloor;
    }
    public int getMinFloor() {
        return minFloor;
    }
    public void setMinFloor (int minFloor) {
        this.minFloor = minFloor;
    }
    public int getMaxFloor() {
        return maxFloor;
    }
    public void setMaxFloor (int maxFloor) {
        this.maxFloor = maxFloor;
    }

    public boolean lift (int minFloorValue, int maxFloorValue, int currentFloorValue) {
        this.minFloor = minFloorValue;
        this.maxFloor = maxFloorValue;
        return maxFloorValue >= currentFloorValue && currentFloorValue >= minFloorValue;
    }
    public void move (int floor) {
        if (floor < maxFloor && floor > minFloor){
            if (floor > currentFloor) {
                System.out.println("Лифт движется вверх с " + currentFloor + " этажа до " + floor + " этажа.");
            } else if (floor < currentFloor) {
                System.out.println("Лифт движется вниз с " + currentFloor + " этажа до " + floor + " этажа.");
            } else {
                System.out.println("Лифт уже находится на этаже " + floor + ".");
                return;
            }
            isMoving = true;
            currentFloor = floor;
            isMoving = false;
            System.out.println("Лифт прибыл на " + currentFloor + " этаж.");
        } else {
            System.out.println("Такого этажа не существует! ");
        }
    }
}
