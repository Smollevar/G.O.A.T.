package day11.task1;

public class Warehouse {
    private int countPickedOrders = 0;
    private int countDeliveredOrders = 0;
    private static int bonusCounterPicked = 0;
    private static int bonusCounterDelivered = 0;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getBonusCounterPicked() {
        return bonusCounterPicked;
    }

    public int getBonusCounterDelivered() {
        return bonusCounterDelivered;
    }

    public void incrementPicked() {
        countPickedOrders++;
        bonusCounterPicked++;
    }

    public void incrementDelivered() {
        countDeliveredOrders++;
        bonusCounterDelivered++;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов: " + countPickedOrders + ", Количество доставленных заказов: " + countDeliveredOrders;
    }
}
