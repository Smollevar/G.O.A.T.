package day7;


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

    public int getLength() {
        return length;
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

    public static void compareAirplane(Airplane plane_1, Airplane plane_2) {
        if (plane_1.getLength() > plane_2.getLength()) {
            System.out.println("Первый самолет длиннее");
        } else if (plane_1.getLength() < plane_2.getLength()) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длинна самолетов одинакова");
        }
    }
}