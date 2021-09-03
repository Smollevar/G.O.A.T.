package day16;

import java.io.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "Numbers";
        File file = new File(path);
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String string = scanner.nextLine();
            String[] arraystring = string.split(" ");
            int sum = 0;
            int counter = 0;
            for (String num : arraystring) {
                sum += Integer.parseInt(num);
                counter++;
            }
            double d = (double) sum/counter;
            System.out.print(d+" --> ");
            System.out.printf("%.3f",d);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

