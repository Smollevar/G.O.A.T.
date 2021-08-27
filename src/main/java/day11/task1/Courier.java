package day11.task1;

public class Courier extends Warehouse implements Worker {
    private Warehouse w;
    private int salary;
    private boolean isPayed;

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        w.incrementDelivered();
    }

    @Override
    public void bonus() {
        if (getIsPayed()) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (super.getBonusCounterDelivered() >= 10000) {
            salary += 50000;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
