package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int maxNumber = 0;
        int minNumber = 10000;
        int numberEndingInZero = 0;
        int sum = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        for (int x : array) if (maxNumber < x) maxNumber = x;
        for (int x : array) if (minNumber > x) minNumber = x;
        for (int x : array)
            if (x % 10 == 0) {
                numberEndingInZero++;
                sum = sum + x;
            }
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальное число массива: " + maxNumber);
        System.out.println("Минимальное число массива: " + minNumber);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + numberEndingInZero);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sum);
    }
}