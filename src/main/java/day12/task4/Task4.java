package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Jojo Armany");
        members1.add("Proto Men");
        MusicBand band1 = new MusicBand("Led Zeppelin", 1968, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("First Name");
        members2.add("Ditry Sanchezz");
        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        MusicBand.transferMembers(band1, band2);
        MusicBand.printMember(members1);
        MusicBand.printMember(members2);
    }
}
