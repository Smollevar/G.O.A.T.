package day12;

import java.util.*;


public class Task2 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if (i % 2 == 0 && (i <= 30 | i >= 300)) {
                array.add(i);
            }
        }
        for (Integer num : array)
            System.out.print(num + " ");
    }
}
