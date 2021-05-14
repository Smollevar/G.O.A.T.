package day4;
import java.util.Random;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);}

            int maxSum = 0;
            int maxIndex = 0;

            for (int i = 0; i < arr.length - 2; i++) {
                int sum = 0;
                for (int g = i; g < i + 3; g++) {sum += arr[g];}
                if (maxSum < sum) { maxSum = sum; maxIndex = i; }}
            System.out.println(maxSum);
            System.out.println(maxIndex);
        }
    }

