package day16;

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        String separator = File.separator;
        String path = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "file1.txt";
        String path2 = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "file2.txt";

        File file = new File(path);
        File file2 = new File(path2);
        try (PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < 1000; i++) {
                pw.print(rnd.nextInt(101) + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }
        try (PrintWriter pw2 = new PrintWriter(file2)) {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] strline = line.split(" ");
            float f = 0;
            int sum = 0;
            int counter = 0;
            for (String cell : strline) {
                sum += Integer.parseInt(cell);
                counter++;
                if (counter == 20) {
                    f = (float) sum / 20;
                    pw2.print(f + " ");
                    sum = 0;
                    counter = 0;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        Task2.printResult(file2);
    }

    public static void printResult(File file) {
        try {
            float f = 0;
            Scanner scanner = new Scanner(file);
            String str = scanner.nextLine();
            String[] str2 = str.split(" ");
            for (String cell : str2) {
                f += Float.parseFloat(cell);
            }
            int i = (int) f;
            System.out.println(i);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
