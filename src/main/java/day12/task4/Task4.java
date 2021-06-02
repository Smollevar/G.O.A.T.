package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Poul Stanley");
        members1.add("Jim Sipa");
        members1.add("Barney Calhoon");
        members1.add("Sayak Stryker");

        MusicBand band1 = new MusicBand("My Fantasy", 1999, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Noise Fair");
        members2.add("Bill Klinton");
        members2.add("Jimmy Mimmi");
        members2.add("Ilove RYTP");
        members2.add("Snoop Cat");

        MusicBand band2 = new MusicBand("Better then reality", 2049, members2);
        band1.printMembers();
        band2.printMembers();

        MusicBand.transfer(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
