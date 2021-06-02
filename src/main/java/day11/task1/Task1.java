package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warhouse1 = new Warehouse();
        Picker picker1 = new Picker(warhouse1);
        Courier courier1 = new Courier(warhouse1);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(picker1);
        System.out.println(courier1);
        System.out.println();
        Warehouse warhouse2 = new Warehouse();
        Picker picker2 = new Picker(warhouse2);
        Courier courier2 = new Courier(warhouse2);
        workOnce(picker2);
        workOnce(courier2);
        System.out.println(picker2 + " " + courier2);
    }

    static void workOnce(Worker worker) {
        worker.doWork();
        worker.bonus();
    }

    static void businessProcess(Worker worker) {

        for (int i = 1; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
