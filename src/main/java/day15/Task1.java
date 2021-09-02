package day15;

import java.io.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        File file = new File(separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "shoes.csv");
        try {
            Scanner scanner = new Scanner(file);
            try (PrintWriter pw = new PrintWriter(separator + "CodeMaster" + separator + "JavaMarathon2021" + separator +
                    "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt")) {
                while (scanner.hasNext()) {
                    String string = scanner.nextLine();
                    String[] arrayString = string.split(";");
                    if (0 == Integer.parseInt(arrayString[2]))
                        pw.println(Arrays.toString(arrayString));
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
