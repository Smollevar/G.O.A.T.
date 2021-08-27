package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 1990, 34, 42000);
        Airplane plane2 = new Airplane("Mikoyan", 1980, 38, 23000);
        Airplane.compareAirplanes(plane1,plane2);
    }
}