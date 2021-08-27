package day3;

import java.util.*;
import java.lang.*;

public class Task1 {
    public static void main(String[] args) {
        do {
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            if (str.equals("Stop")) {
                break;
            }
            switch (str) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        } while (true);
    }
}
