package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            double divisor = scanner.nextDouble();
            double divider = scanner.nextDouble();
            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(divisor / divider);
        }
    }
}
