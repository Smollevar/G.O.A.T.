package FinalProject;

import java.io.IOException;
import java.util.*;

public class Player {
    private String namePalyer;
    private int countShip = 0;
    private final String[][] waterArea = new String[10][10];

    Field emptySquare = Field.EMPTY_SQUARE;
    Field shipSquare = Field.SHIP_SQUARE;
    Field haloSquare = Field.HALO_SQUARE;
    Field hitSquare = Field.HIT_SQUARE;

    public Player() {
    }

    public Player(String namePalyer) {
        this.namePalyer = namePalyer;
    }

    public int getCountShip() {
        return countShip;
    }

    public void setCountShip(int countShip) {
        this.countShip = countShip;
    }

    public String getNamePalyer() {
        return namePalyer;
    }

    public void setNamePalyer(String namePalyer) {
        this.namePalyer = namePalyer;
    }


    Scanner input = new Scanner(System.in);

    public void fillArea() {
        for (String[] strings : waterArea) {
            Arrays.fill(strings, emptySquare.getField());
        }
    }

    public void setShips() {
        if (namePalyer.equals("Player1")) {
            System.out.println("Start off placing ship to first player. Second player, please turn yourself away");
        } else if (namePalyer.equals("Player2")) {
            System.out.println("Start off placing ship to second player. First player, please turn yourself away");
        }
        {
            System.out.println("Enter coordinates four-deck ship (format x1,y1;x2,y2;x3,y3;x4,y4)");

            int p = 0;
            String fourDeck;
            String[] ArrCoord;
            int[] horizon = new int[10];
            int[] vertical = new int[10];
            int valid;
            boolean j = false;
            boolean located = false;
            do {
                if (j)
                    System.out.println("The ship must be straight.");
                if (located)
                    System.out.println("This ship must be located on four slots.");
                valid = 0;
                p++;
                if (p > 1)
                    System.out.println("Try again.");
                fourDeck = input.nextLine();
                ArrCoord = fourDeck.split(";");
                int lengthShip = 0;
                for (String s : ArrCoord) {
                    String[] xy = s.split(",");
                    if (xy.length != 2)
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Count cell in one coordinates must be 2");
                        }
                    else {
                        if (xy[0].matches("[0-9+]") && xy[1].matches("[0-9+]")) {
                            horizon[lengthShip] = Integer.parseInt(xy[0]);
                            vertical[lengthShip] = Integer.parseInt(xy[1]);
                            lengthShip++;
                        } else
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.println("There is need digits in range from 0 to 9");
                            }
                        if (((horizon[0] == horizon[1]) & (horizon[0] == horizon[2]) & (horizon[0] == horizon[3]) & (horizon[1] == horizon[2]) & (horizon[1] == horizon[3]) & (horizon[2] == horizon[3])) & vertical[3] - vertical[2] == 1 & vertical[2] - vertical[1] == 1 & vertical[1] - vertical[0] == 1)
                            valid = 1;
                        else if (((vertical[0] == vertical[1]) & (vertical[0] == vertical[2]) & (vertical[0] == vertical[3]) & (vertical[1] == vertical[2]) & (vertical[1] == vertical[3]) & (vertical[2] == vertical[3])) & horizon[3] - horizon[2] == 1 & horizon[2] - horizon[1] == 1 & horizon[1] - horizon[0] == 1)
                            valid = 1;
                        if (ArrCoord.length != 4)
                            located = true;
                        else
                            located = false;
                        if (valid == 0)
                            j = true;
                    }
                }
            }
            while (ArrCoord.length != 4 || valid == 0);
            for (String s : ArrCoord) {
                String[] xy = s.split(",");
                int x;
                int y;
                x = Integer.parseInt(xy[0]);
                y = Integer.parseInt(xy[1]);
                waterArea[x][y] = shipSquare.getField();
                setHalo(x, y);
            }

        }

        for (int i = 0; i < 2; i++) {
            String ship = "";
            switch (i) {
                case 0:
                    ship = "first";
                    break;
                case 1:
                    ship = "second";
                    break;
            }
            for (String[] strings : waterArea) {
                for (String string : strings) {
                    System.out.print(string);
                }
                System.out.println();
            }

            System.out.println("Enter coordinates " + ship + " third-deck ship (format x1,y1;x2,y2;x3,y3)");
            String thirdDeck;
            String[] ArrCoord;
            int p = 0;
            int halo;
            int valid;
            int[] horizon = new int[10];
            int[] vertical = new int[10];
            int k;
            int m;
            boolean j = false;
            boolean located = false;
            do {
                if (j)
                    System.out.println("The ship must be straight.");
                if (located)
                    System.out.println("This ship must be located on three slots.");
                valid = 0;
                halo = 0;
                p++;
                if (p > 1)
                    System.out.println("Try again.");
                thirdDeck = input.nextLine();
                ArrCoord = thirdDeck.split(";");
                int lengthShip = 0;
                for (String s : ArrCoord) {
                    String[] xy = s.split(",");
                    if (xy.length != 2)
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Count cell in one coordinates must be 2");
                        }
                    else {
                        if (xy[0].matches("[0-9+]") && xy[1].matches("[0-9+]")) {
                            horizon[lengthShip] = Integer.parseInt(xy[0]);
                            vertical[lengthShip] = Integer.parseInt(xy[1]);
                            k = Integer.parseInt(xy[0]);
                            m = Integer.parseInt(xy[1]);
                            if (waterArea[k][m].equals(haloSquare.getField()) | waterArea[k][m].equals(shipSquare.getField()))
                                halo = 1;
                            lengthShip++;
                        } else
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.println("There is need digits in range from 0 to 9");
                            }
                    }
                }
                if (((horizon[0] == horizon[1]) & (horizon[0] == horizon[2]) & (horizon[1] == horizon[2])) & vertical[2] - vertical[1] == 1 & vertical[1] - vertical[0] == 1)
                    valid = 1;
                else if (((vertical[0] == vertical[1]) & (vertical[0] == vertical[2]) & (vertical[1] == vertical[2])) & horizon[2] - horizon[1] == 1 & horizon[1] - horizon[0] == 1)
                    valid = 1;
                if (halo == 1)
                    System.out.println("You cannot place another ship on another or within one cell from it.");
                if (valid == 0)
                    j = true;
                if (ArrCoord.length != 3)
                    located = true;
                else
                    located = false;
            } while (halo == 1 || ArrCoord.length != 3 || valid == 0);
            for (String s : ArrCoord) {
                String[] xy = s.split(",");
                int x = Integer.parseInt(xy[0]);
                int y = Integer.parseInt(xy[1]);
                waterArea[x][y] = shipSquare.getField();
                setHalo(x, y);
            }
        }

        for (int i = 0; i < 3; i++) {
            String ship = "";
            switch (i) {
                case 0:
                    ship = "first";
                    break;
                case 1:
                    ship = "second";
                    break;
                case 2:
                    ship = "third";
                    break;
            }
            for (String[] strings : waterArea) {
                for (String string : strings) {
                    System.out.print(string);
                }
                System.out.println();
            }
            System.out.println("Enter coordinates " + ship + " double-deck ship (format x1,y1;x2,y2)");
            String doubleDeck;
            String[] ArrCoord;
            int p = 0;
            int valid;
            int halo;
            int[] horizon = new int[10];
            int[] vertical = new int[10];
            int lengthShip;
            int k = 0;
            int m;
            boolean j = false;
            boolean located = false;
            do {
                if (j)
                    System.out.println("The ship must be straight.");
                if (located)
                    System.out.println("the ship must be located on two slots");
                valid = 0;
                halo = 0;
                p++;
                if (p > 1)
                    System.out.println("Try again.");
                doubleDeck = input.nextLine();
                ArrCoord = doubleDeck.split(";");
                lengthShip = 0;
                for (String s : ArrCoord) {
                    String[] xy = s.split(",");
                    if (xy.length != 2)
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Count cell in one coordinates must be 2");
                        }
                    else {
                        if (xy[0].matches("[0-9+]") && xy[1].matches("[0-9+]")) {
                            horizon[lengthShip] = Integer.parseInt(xy[0]);
                            vertical[lengthShip] = Integer.parseInt(xy[1]);
                            k = Integer.parseInt(xy[0]);
                            m = Integer.parseInt(xy[1]);
                            if (waterArea[k][m].equals(haloSquare.getField()) | waterArea[k][m].equals(shipSquare.getField()))
                                halo = 1;
                            lengthShip++;
                        } else
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.println("There is need digits in range from 0 to 9");
                            }
                    }
                }
                if ((horizon[0] == horizon[1]) & vertical[1] - vertical[0] == 1)
                    valid = 1;
                else if ((vertical[0] == vertical[1]) & horizon[1] - horizon[0] == 1)
                    valid = 1;
                if (halo == 1)
                    System.out.println("You cannot place another ship on another or within one cell from it.");
                if (ArrCoord.length != 2)
                    located = true;
                else
                    located = false;
                if (valid == 0)
                    j = true;
            } while (halo == 1 || ArrCoord.length != 2 || valid == 0);
            for (String s : ArrCoord) {
                String[] xy = s.split(",");
                int x = Integer.parseInt(xy[0]);
                int y = Integer.parseInt(xy[1]);
                waterArea[x][y] = shipSquare.getField();
                setHalo(x, y);
            }
        }

        for (int i = 0; i < 4; i++) {
            String ship = "";
            switch (i) {
                case 0:
                    ship = "first";
                    break;
                case 1:
                    ship = "second";
                    break;
                case 2:
                    ship = "third";
                    break;
                case 3:
                    ship = "four";
                    break;
            }
            for (String[] strings : waterArea) {
                for (String string : strings) {
                    System.out.print(string);
                }
                System.out.println();
            }
            System.out.println("Enter coordinates " + ship + " single-deck ship (format x1,y1)");
            String singleDeck;
            String[] ArrCoord;
            int p = 0;
            int halo;
            do {
                halo = 0;
                p++;
                if (p > 1)
                    System.out.println("Try again.");
                singleDeck = input.nextLine();
                ArrCoord = singleDeck.split(",");
                if (ArrCoord.length != 2)
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("This ship have only two numbers of coordinates");
                    }
                else {
                    if (ArrCoord[0].matches("[0-9+]") && ArrCoord[1].matches("[0-9+]")) {
                        int horizon = Integer.parseInt(ArrCoord[0]);
                        int vertical = Integer.parseInt(ArrCoord[1]);
                        if (waterArea[horizon][vertical].equals(haloSquare.getField()) | waterArea[horizon][vertical].equals(shipSquare.getField()))
                            halo = 1;
                        System.out.println("You cannot place another ship on another or within one cell from it.");
                    } else
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("There is need digits in range from 0 to 9");
                        }
                }
            } while (halo == 1 || ArrCoord.length != 2);
            int x = Integer.parseInt(ArrCoord[0]);
            int y = Integer.parseInt(ArrCoord[1]);
            waterArea[x][y] = shipSquare.getField();
            setHalo(x, y);
        }
        for (int o = 0; o < 6; o++)
            System.out.println();
    }

    public void setHalo(int x, int y) {
        if (x == 0 && y == 0) {
            if (Objects.equals(waterArea[x][y + 1], emptySquare.getField()))
                waterArea[x][y + 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y + 1], emptySquare.getField()))
                waterArea[x + 1][y + 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y], emptySquare.getField()))
                waterArea[x + 1][y] = haloSquare.getField();
        } else if (x == 9 && y == 0) {
            if (Objects.equals(waterArea[x - 1][y], emptySquare.getField()))
                waterArea[x - 1][y] = haloSquare.getField();
            if (Objects.equals(waterArea[x - 1][y + 1], emptySquare.getField()))
                waterArea[x - 1][y + 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x][y + 1], emptySquare.getField()))
                waterArea[x][y + 1] = haloSquare.getField();
        } else if (x == 0 && y == 9) {
            if (Objects.equals(waterArea[x][y - 1], emptySquare.getField()))
                waterArea[x][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y - 1], emptySquare.getField()))
                waterArea[x + 1][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y], emptySquare.getField()))
                waterArea[x + 1][y] = haloSquare.getField();
        } else if (x == 9 && y == 9) {
            if (Objects.equals(waterArea[x - 1][y], emptySquare.getField()))
                waterArea[x - 1][y] = haloSquare.getField();
            if (Objects.equals(waterArea[x - 1][y - 1], emptySquare.getField()))
                waterArea[x - 1][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x][y - 1], emptySquare.getField()))
                waterArea[x][y - 1] = haloSquare.getField();
        } else if (x == 0 && y > 0) {
            if (Objects.equals(waterArea[x][y - 1], emptySquare.getField()))
                waterArea[x][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y - 1], emptySquare.getField()))
                waterArea[x + 1][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y], emptySquare.getField()))
                waterArea[x + 1][y] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y + 1], emptySquare.getField()))
                waterArea[x + 1][y + 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x][y + 1], emptySquare.getField()))
                waterArea[x][y + 1] = haloSquare.getField();
        } else if (x > 0 && y == 0) {
            if (Objects.equals(waterArea[x - 1][y], emptySquare.getField()))
                waterArea[x - 1][y] = haloSquare.getField();
            if (Objects.equals(waterArea[x - 1][y + 1], emptySquare.getField()))
                waterArea[x - 1][y + 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y], emptySquare.getField()))
                waterArea[x + 1][y] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y + 1], emptySquare.getField()))
                waterArea[x + 1][y + 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x][y + 1], emptySquare.getField()))
                waterArea[x][y + 1] = haloSquare.getField();
        } else if (x == 9 && y > 0) {
            if (Objects.equals(waterArea[x][y - 1], emptySquare.getField()))
                waterArea[x][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x - 1][y - 1], emptySquare.getField()))
                waterArea[x - 1][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x - 1][y], emptySquare.getField()))
                waterArea[x - 1][y] = haloSquare.getField();
            if (Objects.equals(waterArea[x][y + 1], emptySquare.getField()))
                waterArea[x][y + 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x - 1][y + 1], emptySquare.getField()))
                waterArea[x - 1][y + 1] = haloSquare.getField();
        } else if (x > 0 && y == 9) {
            if (Objects.equals(waterArea[x + 1][y], emptySquare.getField()))
                waterArea[x + 1][y] = haloSquare.getField();
            if (Objects.equals(waterArea[x - 1][y], emptySquare.getField()))
                waterArea[x - 1][y] = haloSquare.getField();
            if (Objects.equals(waterArea[x - 1][y - 1], emptySquare.getField()))
                waterArea[x - 1][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x][y - 1], emptySquare.getField()))
                waterArea[x][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y - 1], emptySquare.getField()))
                waterArea[x + 1][y - 1] = haloSquare.getField();
        } else if (x < 9 && x > 0 && y < 9 & y > 0) {
            if (Objects.equals(waterArea[x - 1][y - 1], emptySquare.getField()))
                waterArea[x - 1][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x - 1][y], emptySquare.getField()))
                waterArea[x - 1][y] = haloSquare.getField();
            if (Objects.equals(waterArea[x - 1][y + 1], emptySquare.getField()))
                waterArea[x - 1][y + 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x][y + 1], emptySquare.getField()))
                waterArea[x][y + 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x][y - 1], emptySquare.getField()))
                waterArea[x][y - 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y + 1], emptySquare.getField()))
                waterArea[x + 1][y + 1] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y], emptySquare.getField()))
                waterArea[x + 1][y] = haloSquare.getField();
            if (Objects.equals(waterArea[x + 1][y - 1], emptySquare.getField()))
                waterArea[x + 1][y - 1] = haloSquare.getField();
        }
    }

    public static void checkHalo(Player player, int x, int y) {
        if (x == 0 && y == 0) {
            if (player.waterArea[x][y + 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x == 9 && y == 0) {
            if (player.waterArea[x - 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y + 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x == 0 && y == 9) {
            if (player.waterArea[x][y - 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x == 9 && y == 9) {
            if (player.waterArea[x - 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y - 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x == 0 && y > 0) {
            if (player.waterArea[x][y - 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y + 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x > 0 && y == 0) {
            if (player.waterArea[x - 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y + 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x == 9 && y > 0) {
            if (player.waterArea[x][y - 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x - 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y + 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x > 0 && y == 9) {
            if (player.waterArea[x + 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x - 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y - 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x < 9 && x > 0 && y < 9 & y > 0) {
            if (player.waterArea[x - 1][y - 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }

            if (player.waterArea[x - 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }

            if (player.waterArea[x - 1][y + 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y + 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y - 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y + 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y - 1].equals(player.haloSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Got him!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        }
    }

    public static void checkShip(Player player, int x, int y) {
        if (x == 0 && y == 0) {
            if (player.waterArea[x][y + 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x == 9 && y == 0) {
            if (player.waterArea[x - 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y + 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x == 0 && y == 9) {
            if (player.waterArea[x][y - 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x == 9 && y == 9) {
            if (player.waterArea[x - 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y - 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x == 0 && y > 0) {
            if (player.waterArea[x][y - 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y + 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x > 0 && y == 0) {
            if (player.waterArea[x - 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y + 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x == 9 && y > 0) {
            if (player.waterArea[x][y - 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x - 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y + 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x > 0 && y == 9) {
            if (player.waterArea[x + 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x - 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y - 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        } else if (x < 9 && x > 0 && y < 9 & y > 0) {
            if (player.waterArea[x - 1][y - 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x - 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x - 1][y + 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y + 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x][y - 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y + 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
            if (player.waterArea[x + 1][y - 1].equals(player.shipSquare.getField()) && player.waterArea[x][y].equals(player.shipSquare.getField())) {
                System.out.println("Hit!");
                player.waterArea[x][y] = player.hitSquare.getField();
            }
        }
    }

    public static void game(Player player1, Player player2) {
        int count1;
        int count2;
        boolean continuegame = true;
        Scanner scanner = new Scanner(System.in);
        Player player = choose(player1, player2);
        boolean hit;
        do {
            if (player == player1) {
                hit = true;
                do {
                    int x;
                    int y;
                    System.out.println("Move: " + player1.getNamePalyer());
                    String str = scanner.nextLine();
                    String[] arrstr = str.split(",");
                    if (arrstr.length != 2)
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Coordinates to shoot must have only 2 numbers");
                        }
                    else {
                        if (arrstr[0].matches("[0-9+]") && arrstr[1].matches("[0-9+]")) {
                            x = Integer.parseInt(arrstr[0]);
                            y = Integer.parseInt(arrstr[1]);
                            if (player2.waterArea[x][y].equals(player2.emptySquare.getField()) | player2.waterArea[x][y].equals(player2.haloSquare.getField()) | player2.waterArea[x][y].equals(player2.hitSquare.getField())) {
                                player = player2;
                                System.out.println("Miss");
                                hit = false;
                            }
                            checkShip(player2, x, y);
                            checkHalo(player2, x, y);
                            count2 = 0;
                            for (int i = 0; i < player2.waterArea.length; i++) {
                                for (int j = 0; j < player2.waterArea[i].length; j++) {
                                    if (player2.waterArea[i][j].equals(player2.shipSquare.getField()))
                                        count2++;
                                }
                            }
                            player2.setCountShip(count2);
                            if (count2 == 0) {
                                hit = false;
                                continuegame = false;
                            }
                        } else
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.println("There is need digits in range from 0 to 9");
                            }
                    }
                } while (hit);
            }

            if (player == player2) {
                hit = true;
                do {
                    int x;
                    int y;
                    System.out.println("Move: " + player2.getNamePalyer());
                    String str = scanner.nextLine();
                    String[] arrstr = str.split(",");
                    if (arrstr.length != 2)
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Coordinates to shoot must have only 2 numbers");
                        }
                    else {
                        if (arrstr[0].matches("[0-9+]") && arrstr[1].matches("[0-9+]")) {
                            x = Integer.parseInt(arrstr[0]);
                            y = Integer.parseInt(arrstr[1]);
                            if (player1.waterArea[x][y].equals(player1.emptySquare.getField()) | player1.waterArea[x][y].equals(player1.haloSquare.getField()) | player1.waterArea[x][y].equals(player1.hitSquare.getField())) {
                                player = player1;
                                System.out.println("Miss");
                                hit = false;
                            }
                            checkShip(player1, x, y);
                            checkHalo(player1, x, y);
                            count1 = 0;
                            for (int i = 0; i < player1.waterArea.length; i++) {
                                for (int j = 0; j < player1.waterArea[i].length; j++) {
                                    if (player1.waterArea[i][j].equals(player1.shipSquare.getField()))
                                        count1++;
                                }
                            }
                            player1.setCountShip(count1);
                            if (count1 == 0) {
                                hit = false;
                                continuegame = false;
                            }
                        } else
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.println("There is need digits in range from 0 to 9");
                            }
                    }
                } while (hit);
            }
        } while (continuegame);

        if (player2.getCountShip() > player1.getCountShip())
            System.out.println("Winner is: " + player2.getNamePalyer());
        else if (player1.getCountShip() > player2.getCountShip()) {
            System.out.println("Winner is: " + player1.getNamePalyer());
        }
    }

    public static Player choose(Player player1, Player player2) {
        Random random = new Random();
        boolean result = random.nextBoolean();
        if (result) {
            return player1;
        } else
            return player2;
    }

    public void printArea() {
        for (String[] strings : waterArea) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }


}
