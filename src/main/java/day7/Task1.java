package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane_1 = new Airplane ("Dornier",2006,38,4400);
        Airplane plane_2 = new Airplane ("SuperJet",1999,56,7800);
        Airplane.compareAirplane(plane_1,plane_2);
    }
}