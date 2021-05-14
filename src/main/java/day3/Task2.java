package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите делимое");
            double a = scanner.nextDouble();
            System.out.println("Введите делитель");
            double b = scanner.nextDouble();
            if (b == 0){
                System.out.println("Деление на ноль");
                break;}
            System.out.println(a / b);

        }
    }
}
