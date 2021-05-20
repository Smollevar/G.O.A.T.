package day5;


import java.awt.*;

public class Task2 {
    public static void main(String[] args) {
        Motorcycle mrc = new Motorcycle(1923, "Grey", "BMW");
        System.out.println(mrc.getYearOfIssue() + " " + mrc.getColor() + " " + mrc.getMod());
    }
}

class Motorcycle {
    private int yearOfIssue;
    private String Color;
    private String Mod;

    public Motorcycle(int yearOfIssue, String Color, String Mod) {
        this.yearOfIssue = yearOfIssue;
        this.Color = Color;
        this.Mod = Mod;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return Color;
    }

    public String getMod() {
        return Mod;
    }
}