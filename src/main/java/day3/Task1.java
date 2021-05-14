package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner NameOfTown = new Scanner(System.in);
        while (true) {
            System.out.println("Enter name of town");
            String NOT = NameOfTown.nextLine();
            if (NOT.equals("Stop"))
                break;
            switch (NOT) {
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
                    break;
            }
        }
    }
}
