package FinalProject;

import java.io.IOException;
import java.util.*;

/**
 * @author Dmitry Kravtsov
 */
public class Game {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sea battle game");
        System.out.println("Select Player1 or Player2");
        boolean insertName = true;
        Player p1 = new Player();
        String secondName = null;
        while (insertName) {
            String str = scanner.nextLine();
            if (str.equals("Player1")) {
                p1.setNamePalyer(str);
                insertName = false;
            } else if (str.equals("Player2")) {
                p1.setNamePalyer(str);
                insertName = false;
            } else {
                System.out.println("Wrong name of player, please type *Player1* or *Player2*.");
            }
        }
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
