package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner src = new Scanner(System.in);
        int eight = 0, n, one = 0, even = 0, odd = 0, sum = 0;
        n = src.nextInt();
        int[] arr = new int[n];
        for (int l = 0; l < arr.length; l++) {
            arr[l] = rand.nextInt(11);
        }
        for (int j : arr) {
            if (j > 8) {
                eight++;
            }
            if (j == 1) {
                one++;
            }
            if (j % 2 == 0) {
                even++;
            }
            if (j % 2 != 0) {
                odd++;
            }
            sum = sum + j;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println("Количество чисел больше 8: " + eight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
