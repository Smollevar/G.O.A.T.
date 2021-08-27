package day9.Task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        //double p = 0.5 * (a + b + c);
        // double S = a * b * c / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        double S = a * b * c;
        return S;
    }

    public double perimeter() {
        double P = a + b + c;
        return P;
    }
}
