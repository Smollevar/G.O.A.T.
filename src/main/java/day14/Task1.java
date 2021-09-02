package day14;

import java.io.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "Numbers";
        File file = new File(path);
        Task1.printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numString = line.split(" ");
            int[] arrayInt = new int[10];
            if (numString.length != 10)
                throw new IllegalArgumentException();
            int counter = 0;
            int sum = 0;
            for (String sti : numString) {
                arrayInt[counter] = Integer.parseInt(sti);
                counter++;
            }
            for (int summary : arrayInt) {
                sum = sum + summary;
            }



            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}

/*
Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numberString = line.split(" ");

            int[] numbers = new int[10];
            int counter = 0;
            int sumArray = 0;

            for (String inputnum : numberString) {
                numbers[counter] = Integer.parseInt(inputnum);
            }
            if (numbers.length != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            }
            for (int sum : numbers) {
                sumArray = sumArray + sum;
            }

            System.out.println(sumArray);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
 */