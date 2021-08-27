package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int maxNum = 0;
        int array = 0;
        Random ran = new Random();
        int[][] matrix = new int[12][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ran.nextInt(50);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            if (maxNum < sum) {
                array = i;
                maxNum = sum;
            }
            System.out.print("Сумма элемнтов строки: " + sum);
            System.out.println();
        }
        System.out.println("Ответ: " + array);
    }
}