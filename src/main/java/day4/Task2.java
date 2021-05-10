package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int maxNumber = 0;
        int minNumber = 10000;
        int numberEndingInZero = 0;
        int sum = 0;
        int[] handredArray = new int[100];
        for (int i = 0; i < handredArray.length; i++){
            handredArray[i] = (int) (Math.random() * 10000);
    }
                for(int x: handredArray)
                if (maxNumber < x)
                    maxNumber = x;
        for(int x: handredArray)
                if (minNumber > x)
                    minNumber = x;
        for(int x: handredArray)
                if (x%10==0) {
                    numberEndingInZero++;
                    sum = sum + x;
                }


            System.out.println(Arrays.toString(handredArray));
        System.out.println("Максимальное число массива: "+maxNumber);
        System.out.println("Минимальное число массива: "+ minNumber);
        System.out.println("Количество элементов массива, оканчивающихся на 0: "+numberEndingInZero);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: "+sum);
        }
    }

