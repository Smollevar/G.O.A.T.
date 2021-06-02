package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Kamaz");
        cars.add("Opel");
        cars.add("Citroën");
        cars.add("Kio");
        cars.add("Mitsubishi");
        for (String allcars : cars) {
            System.out.print(allcars + " ");
        }
        cars.add(2, "Toyota");
        cars.remove(0);
        System.out.println();
        for (String allcar : cars) {
            System.out.print(allcar + " ");
        }
    }
}

