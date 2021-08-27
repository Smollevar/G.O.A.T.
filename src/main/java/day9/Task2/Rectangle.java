package day9.Task2;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public double area() {
        double S = a * b;
        return S;
    }

    public double perimeter() {
        double P = 2 * (a + b);
        return P;
    }
}
