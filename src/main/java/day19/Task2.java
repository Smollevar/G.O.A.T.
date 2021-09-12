package day19;

import java.io.*;
import java.util.*;

/**
 * @author Dmitry Kravtsov
 */
public class Task2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String separator = File.separator;
        String path = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "numbers19.txt";
        File file = new File(path);
        Map<Integer, Integer> numbers = new HashMap<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        while (true) {
            try {
                if ((line = br.readLine()) == null) break;
            } catch (IOException e) {
                System.out.println("Error read or write");
            }
            stringBuilder.append(line).append("\n");
        }
        try {
            br.close();
        } catch (IOException e) {
            System.out.println("Error closing reader");
        }
        int count = 0;
        int c = 0;
        int[] allDigit = new int[500000];
        String content = stringBuilder.toString();
        Scanner scanner = new Scanner(content);
        while(scanner.hasNextLine()){
            allDigit [c] = Integer.parseInt(scanner.nextLine());
            c++;
        }
        System.out.println();
        for (int h : allDigit) {
            if (h >= 500000000 && h <= 600000000) {
                numbers.put(h, count++);
            }
        }
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) >= 0) {
                maxEntry = entry;
            }
        }
        System.out.println("Numbers in the range: " + maxEntry.getValue());
        long end = System.currentTimeMillis();
        System.out.println("Program running time: " + (end - start));
    }
}
