package FinalProject;

import java.util.*;

/**
 * @author Dmitry Kravtsov
 */
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sea battle game");
        System.out.println("Select Player1 or Player2");
        Player p1 = new Player(scanner.nextLine());
        String secondName = null;
        if (p1.getNamePalyer().equals("Player1")) {
            secondName = "Player2";
        } else if (p1.getNamePalyer().equals("Player2")) {
            secondName = "Player1";
        }
        Player p2 = new Player(secondName);
        p1.fillArea();
        p2.fillArea();
        p1.setShips();
        p2.setShips();
        Player.game(p1, p2);
        System.out.println("area " + p1.getNamePalyer());
        p1.printArea();
        System.out.println("area " + p2.getNamePalyer());
        p2.printArea();
    }
}
