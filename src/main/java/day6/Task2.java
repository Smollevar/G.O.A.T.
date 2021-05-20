package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane_1 = new Airplane("Boeing", 1980, 33, 5600);
        plane_1.info();
        Airplane plane_2 = new Airplane("SuperJet", 1999, 56, 7800);
        plane_2.info();
        plane_2.fillUp(333);
        plane_2.setYear(2005);
        plane_2.setLength(42);
        plane_2.fillUp(153);
        plane_2.info();
    }
}

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setProducer(String x) {
        this.producer = x;
    }

    public void setYear(int x) {
        this.year = x;
    }

    public void setLength(int x) {
        this.length = x;
    }

    public void setWeight(int x) {
        this.weight = x;
    }

    public void setFuel(int x) {
        this.fuel = x;
    }

    public int getFuel() {
        return fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + " год выпуска: " + year + " длина: " + length +
                " вес: " + weight + " Количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        System.out.println("Заправка на: " + n + " Литра");
        this.fuel = fuel + n;
    }
}
