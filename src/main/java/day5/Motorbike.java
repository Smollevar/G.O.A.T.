package day5;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String mod;

    public Motorbike(int yearOfIssue, String color, String mod) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.mod = mod;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getMod() {
        return mod;
    }
}
