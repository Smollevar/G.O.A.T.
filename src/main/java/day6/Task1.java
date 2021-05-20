package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(1990);
        car1.info();
        int yearDifference_1 = car1.yearDifference(1989);
        System.out.println("Возраст авто: " + yearDifference_1);
        Motorcycle motor = new Motorcycle(2005, "Blue", "Yamaha");
        int yearDifferMotor = motor.yearDifference(2010);
        motor.info();
        System.out.println("Возраст мотоцикла: " + yearDifferMotor);
    }
}
