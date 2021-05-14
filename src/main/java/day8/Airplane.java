package day8;

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
        System.out.println("Заправка на: "+n+" Литра");
        this.fuel = fuel+ n;
    }

    public String toString(){
        return producer+" "+year+" "+length+" "+weight;
    }
}
