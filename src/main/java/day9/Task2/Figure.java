package day9.Task2;

public abstract class Figure {
    protected String Color;

    public Figure(String color) {
        this.Color = color;
    }

    public String getColor() {
        return Color;
    }

    public abstract double area();

    public abstract double perimeter();
}
