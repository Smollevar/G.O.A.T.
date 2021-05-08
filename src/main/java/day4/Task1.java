package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
    Scanner scr = new Scanner(System.in);

        System.out.println("Задайте размер массива");
            int n = scr.nextInt();
            int [] mall = new int [n];
            int l = mall.length;
        int sum = 0;
            for(int i = 0; i<mall.length;i++){
                rnd.nextInt(11);
                sum += mall[i];
                System.out.print(mall[i]+" ");
            }

        System.out.println("Длинна массива "+ l);

    }
}
