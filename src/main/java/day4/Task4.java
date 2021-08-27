package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int sumtree = 0;
        int index = 0;
        Random ran = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(10000);
        }
        for (int i = 0; i < arr.length-3; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum = sum + arr[j];
            }
            if (sumtree < sum) {
                sumtree = sum;
                index = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sumtree);
        System.out.println(index);
    }
}

