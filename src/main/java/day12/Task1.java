/**
Класс Car был сделан с целью личной практики, и в связи с отсутствием тестов на 1 квест.
 */
package day12;

import day12.PackOfCar.Car;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Car> carlist = new ArrayList<>();
        carlist.add(new Car("Lada", 2000));
        carlist.add(new Car("BMW", 2001));
        carlist.add(new Car("Mercedes", 1993));
        carlist.add(new Car("Jeep", 2010));
        carlist.add(new Car("Renault", 2015));
        for (Car car : carlist) {
            System.out.println(car.getYearOfIssue());
        }
    }
}
