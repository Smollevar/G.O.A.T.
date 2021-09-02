package day6;

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

    void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - yearOfIssue);
    }
}