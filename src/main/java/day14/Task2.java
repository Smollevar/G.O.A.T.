package day14;

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "people.txt";
        File file = new File(path);
        System.out.println(Task2.parseFileToStringList(file));
    }
    public static List<String> parseFileToStringList(File file) {
        List<String> arrayPeople = new ArrayList<>();
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (0>=Integer.parseInt(person[1])) {
                    throw new IllegalArgumentException();
                }
                arrayPeople.add(line);
            }
            return arrayPeople;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
