package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt(11) + 90;
        int b = rnd.nextInt(11) + 90;
        int c = rnd.nextInt(11) + 90;
        int d = rnd.nextInt(11) + 90;
        int f = rnd.nextInt(11) + 90;
        int g = rnd.nextInt(11) + 90;
        int h = rnd.nextInt(11) + 90;
        int j = rnd.nextInt(11) + 90;
        Player pl1 = new Player(a);
        Player pl2 = new Player(b);
        Player pl3 = new Player(c);
        Player pl4 = new Player(d);
        Player pl5 = new Player(f);
        Player pl6 = new Player(g);
        pl1.info();
        Player pl7 = new Player(h);
        System.out.println(Player.getCountPlayers());
        Player pl8 = new Player(j);
        for (int i = 0; i < 100; i++) {
            pl1.run();
        }
        Player.info();

    }
}
