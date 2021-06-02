package day12.task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Poul Stanley",23));
        members1.add(new MusicArtist("Jim Sipa",34));
        members1.add(new MusicArtist("Barney Calhoon",27));
        members1.add(new MusicArtist("Sayak Stryker",36));

        MusicBand band1 = new day12.task5.MusicBand("My Fantasy", 1999, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Noise Fair",55));
        members2.add(new MusicArtist("Bill Klinton",36));
        members2.add(new MusicArtist("Jimmy Mimmi",44));
        members2.add(new MusicArtist("Ilove RYTP",42));
        members2.add(new MusicArtist("Snoop Cat",32));

        MusicBand band2 = new day12.task5.MusicBand("Better then reality", 2049, members2);
        band1.printGroupName();
        band1.printMembers();
        band2.printGroupName();
        band2.printMembers();

        MusicBand.transfer(band1, band2);
        band1.printGroupName();
        band1.printMembers();
        band2.printGroupName();
        band2.printMembers();
    }
}
