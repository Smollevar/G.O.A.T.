package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int highEightCounter = 0;
        int equalsOne = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;
        Random rnd = new Random();
    Scanner scr = new Scanner(System.in);
        System.out.println("Задайте размер массива");
        int n = scr.nextInt();
            int [] array = new int [n];
            for(int i = 0;i<array.length;i++){
               array[i]= rnd.nextInt(11);
               if (array[i]>8)
                   highEightCounter++;
               if (array[i]==1)
                   equalsOne++;
               if (array[i]%2==0)
                   evenNumbers++;
               if (array[i]%2!=0)
                   oddNumbers++;
               sum = array[i] + sum;
            }
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива "+ array.length);
        System.out.println("Чисел больше 8: "+highEightCounter);
        System.out.println("Чисел равных еденице: "+equalsOne);
        System.out.println("Четных чисел: "+evenNumbers);
        System.out.println("Нечетных чисел: "+oddNumbers);
        System.out.println("Сумма всех элементов массива: "+sum);
    }
}
