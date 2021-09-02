package day14;

import java.io.*;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "people.txt";
        File file = new File(path);
        System.out.println(Task3.parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> person = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] split = line.split(" ");
                String name = split[0];
                int age = Integer.parseInt(split[1]);
                if (age <= 0) {
                    throw new IllegalArgumentException();
                }
                person.add(new Person(name, age));
            }
            return person;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
