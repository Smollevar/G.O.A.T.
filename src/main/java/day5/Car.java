package day5;

public class Car {
    private int yearofissue;
    private String color;
    private String model;

    public Car(int yearofissue, String color, String model) {
        this.yearofissue = yearofissue;
        this.color = color;
        this.model = model;
    }

    public int getYearofissue() {
        return yearofissue;
    }

    public void setYearofissue(int yearofissue) {
        this.yearofissue = yearofissue;
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
}
