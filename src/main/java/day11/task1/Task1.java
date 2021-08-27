package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wr = new Warehouse();
        Picker p1 = new Picker(wr);
        Courier c1 = new Courier(wr);
        businessProcess(c1);
        businessProcess(p1);
        System.out.println(wr.toString());
        System.out.println(p1.toString());
        System.out.println(c1.toString());
        Warehouse wr2 = new Warehouse();
        Picker p2 = new Picker(wr);
        Courier c2 = new Courier(wr);
        for (int i = 0; i < 10; i++) {
            c2.doWork();
        }
        p2.doWork();
        p2.bonus();
        c2.bonus();
        System.out.println(wr2.toString());
        System.out.println(p2.toString());
        System.out.println(c2.toString());
        System.out.println(p1.toString());
        System.out.println(c1.toString());
        System.out.println(wr.toString());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }


}
