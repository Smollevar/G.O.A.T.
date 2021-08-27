package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            double divisor = scanner.nextDouble();
            double divider = scanner.nextDouble();
            if (divider == 0) {
                break;
            }
            System.out.println(divisor / divider);
        }
    }
}
