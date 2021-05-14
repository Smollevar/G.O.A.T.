package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int maxNum = 0;
        int indexOfString = 0;
        int[][] twoArray = new int[12][8];
        for (int i = 0; i < twoArray.length; i++)
            for (int n = 0; n < twoArray[i].length; n++)
                twoArray[i][n] = (int) (Math.random() * 50);
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < twoArray.length; i++) {
            int sum = 0;
            for (int n = 0; n < twoArray[i].length; n++) {
                System.out.print(twoArray[i][n] + " ");
                sum += twoArray[i][n];}
            System.out.println(" // Сумма элементов массива: " + sum);
            if (maxSum <= sum) {
                maxSum = sum;
                maxIndex = i;}}
        System.out.print("Сумма элементов большего массива- " + maxSum);
        System.out.println(" Индекс большей строки: " + maxIndex);}}