package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int zerocounter = 0;
        int sumzero = 0;
        int larger = 0;
        int lowest = 10000;
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        for (int hundred : arr) {
            if (larger < hundred) {
                larger = hundred;
            }
            if (lowest > hundred) {
                lowest = hundred;
            }
            if(hundred%10==0){
                zerocounter++;
                sumzero = sumzero + hundred;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Большее число массива: " + larger);
        System.out.println("Меньшее число массива: " + lowest);
        System.out.println("Количество элементов массива, оканчивающихся на 0: "+zerocounter);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: "+sumzero);

    }
}

/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000. CHECK
Затем, используя цикл for each вывести в консоль: CHECK
наибольший элемент массива CHECK
наименьший элемент массива CHECK
количество элементов массива, оканчивающихся на 0 CHECK
сумму элементов массива, оканчивающихся на 0 CHECK

Использовать сортировку запрещено.

 */