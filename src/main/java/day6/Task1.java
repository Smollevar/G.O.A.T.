package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike(2000, "Blue", "Yamaha");
        Car car = new Car(1980,"Yellow","Jeep");
        car.info();
        moto.info();
        System.out.println(moto.yearDifference(1990));
        System.out.println(car.yearDifference(1909));
    }
}

