package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(1990);
        car1.setColor("Blue");
        car1.setMod("OffRoad");
        System.out.print(car1.getYearOfIssue() + " " + car1.getColor() + " " + car1.getMod());
    }
}

class Car {
    private int yearOfIssue;
    private String Color;
    private String Mod;

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void setMod(String Mod) {
        this.Mod = Mod;
    }

    public String getMod() {
        return Mod;
    }
}