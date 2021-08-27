package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing",1970, 33, 40000);
        plane.setYear(1980);
        plane.setLength(38);
        plane.fillUp(100);
        plane.fillUp(4900);
        plane.info();
    }
}
