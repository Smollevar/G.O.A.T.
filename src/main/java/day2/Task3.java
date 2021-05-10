package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scr.nextInt();
        System.out.println("Введите второе число");
        int b = scr.nextInt();
        int l = a+1;
        while (l<b){
            if (l % 5 == 0 && l % 10 != 0)
                System.out.println(l);
            l++;
        }
    }
}
