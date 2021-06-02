package day12.task3;

import javafx.print.Collation;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("The Beatles", 1960);
        MusicBand band2 = new MusicBand("The Rolling Stones", 1962);
        MusicBand band3 = new MusicBand("Авиатор ", 2005);
        MusicBand band4 = new MusicBand("The Grateful Dead", 1965);
        MusicBand band5 = new MusicBand("Velvet Underground", 1964);
        MusicBand band6 = new MusicBand("Led Zeppelin", 1968);
        MusicBand band7 = new MusicBand("Руки Вверх!", 2006);
        MusicBand band8 = new MusicBand("Pink Floyd", 1965);
        MusicBand band9 = new MusicBand("Bob Marley and the Wailers", 1963);
        MusicBand band10 = new MusicBand("Sly and the Family Stone", 1966);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);



    List<MusicBand> groupsAfter2000 = new ArrayList<>();

    for (MusicBand band : musicBands){
        if (band.getYear()>2000)
            groupsAfter2000.add(band);
    }
        System.out.println(groupsAfter2000);

    }

}