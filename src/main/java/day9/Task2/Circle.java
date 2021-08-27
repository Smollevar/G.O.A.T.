package day9.Task2;

import static java.lang.Math.*;

public class Circle extends Figure {
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public double area(){
        double S = PI * pow(r,2);
        return S;
    }

    public double perimeter() {
        double P = 2 * PI * r;
        return P;
    }


}
