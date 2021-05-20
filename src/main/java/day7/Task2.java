package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();//Ничего лучше не придумал кроме как каждый раз писать новую переменную под каждый обьект класса
        int m = rnd.nextInt(100 - 90 + 1) + 90;
        int f = rnd.nextInt(100 - 90 + 1) + 90;
        int a = rnd.nextInt(100 - 90 + 1) + 90;
        int x = rnd.nextInt(100 - 90 + 1) + 90;
        int d = rnd.nextInt(100 - 90 + 1) + 90;
        int g = rnd.nextInt(100 - 90 + 1) + 90;
        int h = rnd.nextInt(100 - 90 + 1) + 90;
        int p = rnd.nextInt(100 - 90 + 1) + 90;
        Player p1 = new Player(m);
        Player p2 = new Player(f);
        Player p3 = new Player(a);
        Player p4 = new Player(x);
        Player p5 = new Player(d);
        Player p6 = new Player(g);
        Player p7 = new Player(f);
        Player.info();
        Player p8 = new Player(h);
        Player p9 = new Player(p);
        Player.info();
        for (int i = 0; i < 100; i++) p3.run();
        Player.info();
        p1.info2();
        p2.info2();
        p3.info2();
        p4.info2();
        p5.info2();
        p6.info2();
    }
}

class Player {
    private int stamina;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
    }

    public int getstamina() {
        return stamina;
    }

    public int getcountPlayers() {
        return countPlayers;
    }

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    public void run() {
        if (stamina == 0) return;
        stamina--;
        if (stamina == 0) countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            int freeSlot = 6 - countPlayers;
            String GrammarLine = null;
            switch (freeSlot) {
                case 1:
                    GrammarLine = "Свободное место";
                    break;
                case 2:
                    GrammarLine = "Свободных места";
                    break;
                case 3:
                    GrammarLine = "Свободных места";
                    break;
                case 4:
                    GrammarLine = "Свободных места";
                    break;
                case 5:
                    GrammarLine = "Свободных мест";
                    break;
            }
            System.out.println("Команды не полные. на поле еще есть " + freeSlot + " " + GrammarLine);
        } else {
            System.out.println("На поле нет свободных мест");
        }
        System.out.println("Количетсво игроков на поле " + countPlayers);
    }

    public void info2() {
        System.out.println("Количество выносливости: " + stamina);
    }
}



