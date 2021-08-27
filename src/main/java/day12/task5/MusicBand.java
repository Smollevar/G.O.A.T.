package day12.task5;

import java.util.List;


public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;


    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.getMembers().addAll(band1.getMembers());
        band1.getMembers().removeAll(band1.getMembers());
    }

    public static void printMember(MusicBand band) {
        System.out.println("Starring: " + band.getMembers());
    }

    @Override
    public String toString() {
        return "Name of band: " + getName() + ", Year of foundation: " + getYear();
    }
}
