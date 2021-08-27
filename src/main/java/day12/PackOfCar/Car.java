package day12.PackOfCar;

public class Car {
    private String manufacturer;
    private int yearOfIssue;

    public Car(String manufacturer, int yearOfIssue) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
