package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        } else {
            return;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == MIN_STAMINA) return;
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {
        String grammarnazi = null;
        switch (countPlayers) {
            case 5:
                grammarnazi = "одно свободное место";
                break;
            case 4:
                grammarnazi = "два свободных места";
                break;
            case 3:
                grammarnazi = "три свободных места";
                break;
            case 2:
                grammarnazi = "четыре свободных места";
                break;
            case 1:
                grammarnazi = "пять свободных мест";
                break;
            case 0:
                grammarnazi = "шесть свободных мест";
                break;
        }
        if (countPlayers < 6) {
            System.out.println("Команды неполные, на поле еще есть " + grammarnazi);
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
