package day19;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Dmitry Kravtsov
 */
public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<>();
        Map<String, Integer> wordCounter = new HashMap<>();
        String separator = File.separator;
        String path = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "dushi.txt";
        File file = new File(path);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        while (true) {
            try {
                if ((line = reader.readLine()) == null) break;
            } catch (IOException e) {
                System.out.println("Error read or write");
            }
            stringBuilder.append(line);
        }
        try {
            reader.close();
        } catch (IOException e) {
            System.out.println("Error closing reader");
        }
        int i = 0;
        StringBuilder stringBuilder1 = new StringBuilder();
        String content = stringBuilder.toString(); // Convert linestring from stringBuilder to string
        Scanner scannerTwo = new Scanner(content).useDelimiter("[.,:;()?!\"\\s–]+");
        while (scannerTwo.hasNext()) {
            stringBuilder1.append(scannerTwo.next() + " ");
        }
        String txt = stringBuilder1.toString();
        String[] strArr = null;
        strArr = txt.split(" ");
        int count = 0;
        for (String s : strArr) {
            if (wordCounter.containsKey(s)) {
                count = wordCounter.get(s);
                wordCounter.put(s, count + 1);
            } else {
                wordCounter.put(s, 1);
            }
        }
        wordCounter.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).limit(100)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))
                .forEach((s, integer) -> System.out.println(String.format("%s : %s", s, integer)));
        //Чичиков - 599
        Scanner scanner = new Scanner(content).useDelimiter(("[.,:;()?!\"\\s–]+"));
        while (scanner.hasNext()) {
            words.put(i, scanner.next());
            i++;
        }
        scanner.close();
    }
}