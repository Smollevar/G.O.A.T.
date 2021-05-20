package day9.Task2;

public class Triangle extends Figure {
    public double S;
    private double sideLength_1, sideLength_2, sideLength_3;


    public Triangle(String color, double sideLength_1, double sideLength_2, double sideLength_3) {
        super(color);
        this.sideLength_1 = sideLength_1;
        this.sideLength_2 = sideLength_2;
        this.sideLength_3 = sideLength_3;
    }

    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return Math.sqrt(halfP * (halfP - sideLength_1) * (halfP - sideLength_2) * (halfP - sideLength_3));

    }

    @Override
    public double perimeter() {
        return sideLength_1 + sideLength_2 + sideLength_3;
    }
}
