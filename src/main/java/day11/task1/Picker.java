package day11.task1;

public class Picker extends Warehouse implements Worker {
    private Warehouse w;
    private int salary;
    private boolean isPayed;

    public Picker( Warehouse w) {
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
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        w.incrementPicked();
    }

    @Override
    public void bonus() {
        if (getIsPayed()) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (super.getBonusCounterPicked() >= 10000) {
            salary += 70000;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
