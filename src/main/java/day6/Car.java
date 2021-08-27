package day6;

public class Car {
    private int yearOfIssue;
    private String color;
    private String model;

    public Car(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public int getyearOfIssue() {
        return yearOfIssue;
    }

    public void setYear(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        int diff = inputYear - yearOfIssue;
        if (diff < 0)
            diff = diff * -1;
        return diff;
    }
}
