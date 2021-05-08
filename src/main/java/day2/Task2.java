package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = g.nextInt();
        System.out.println("Введите второе число");
        int b = g.nextInt();
        for(int j = a;a<=b;a++){
            if (a%5==0&&a%10!=0){
                System.out.println(a);
            }
        }
    }
}
