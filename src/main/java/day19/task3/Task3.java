package day19.task3;

import java.io.*;
import java.util.*;

/**
 * @author Dmitry Kravtsov
 */
public class Task3 {
    public static void main(String[] args) {
        Map<Integer, Point> cars = new HashMap<>();
        String separator = File.separator;
        String path = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "taxi_cars.txt";
        File file = new File(path);

        BufferedReader br = null;
        try {
            br = new BufferedReader((new FileReader(file)));
        } catch (FileNotFoundException e) {
            System.out.println("File not found here");
        }
        StringBuilder sb = new StringBuilder();
        String line = null;
        while (true) {
            try {
                if ((line = br.readLine()) == null) break;
            } catch (IOException e) {
                System.out.println("Error read or write");
            }
            sb.append(line).append("\n");
        }
        try {
            br.close();
        } catch (IOException e) {
            System.out.println("Error closing reader");
        }
        String convertMe = sb.toString();
        String[] c = convertMe.split("\n");
        for (String g : c) {
            String[] str = g.split(" ");
            int id = Integer.parseInt(str[0]);
            int x = Integer.parseInt(str[1]);
            int y = Integer.parseInt(str[2]);
            Point p = new Point(x, y);
            cars.put(id, p);
        }
        int x1, x2, y1, y2;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter x1");
            x1 = scanner.nextInt();
            System.out.println("Enter y1");
            y1 = scanner.nextInt();
            System.out.println("Enter x2");
            x2 = scanner.nextInt();
            System.out.println("Enter y2");
            y2 = scanner.nextInt();
            if (x1 >= x2 && y1 >= y2) {
                System.out.println("Wrong parameters");
            } else
                break;
        }
        int countCar = 0;
        for (Map.Entry<Integer, Point> entry : cars.entrySet()) {
            if (x1 < entry.getValue().getX() && entry.getValue().getY() < y1 && x2 > entry.getValue().getX() && entry.getValue().getY() > y2) {
                System.out.println(entry.getKey());
                countCar++;
            }
        }
        System.out.println("Number of cars in squared: " + countCar);
    }
}
