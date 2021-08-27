package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<MusicBand> bands = new ArrayList<>(12);
        bands.add(new MusicBand("Rolling Stones", 1962));
        bands.add(new MusicBand("Carpenter Brut", 2012));
        bands.add(new MusicBand("Judas Priest", 1969));
        bands.add(new MusicBand("Led Zeppelin", 1968));
        bands.add(new MusicBand("The Beatles", 1960));
        bands.add(new MusicBand("Megadeth", 1983));
        bands.add(new MusicBand("Sex Pistol", 1975));
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("System of down", 1994));
        bands.add(new MusicBand("БИ-2", 1988));
        bands.add(new MusicBand("7-Б", 2001));
        bands.add(new MusicBand("Ленинград", 1997));
        bands.add(new MusicBand("Крематорий", 1983));
        Collections.shuffle(bands);
        for (MusicBand mus : bands) {
            System.out.println(mus.toString());
        }
        System.out.println();
        System.out.println(groupsAfter2000(bands));
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time of work programm: "+ (end-start));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> twoThousand = new ArrayList<>();
        for (MusicBand mus : bands) {
            if (mus.getYear() >= 2000) {
                twoThousand.add(mus);
            }
        }
        return twoThousand;
    }

}

