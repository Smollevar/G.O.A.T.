package day12.task5;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Rob", 26));
        members1.add(new MusicArtist("Jim", 29));
        MusicBand band1 = new MusicBand("Led Zeppelin", 1968, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("John", 31));
        members2.add(new MusicArtist("Rodrigezz", 21));
        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);
        MusicBand.transferMembers(band1,band2);
        MusicBand.printMember(band1);
        MusicBand.printMember(band2);
    }
}
