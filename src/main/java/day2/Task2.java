package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = g.nextInt();
        System.out.println("Введите второе число");
        int b = g.nextInt();
        if (a>=b)
            System.out.println("Некорректный ввод");
        int i = a++;
        for(int j = i;i<b;i++){
            if (i%5==0&&i%10!=0){
                System.out.println(i);
            }
        }
    }
}
