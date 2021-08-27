package day12.task4;

import java.util.*;


public class MusicBand {
    private String name;
    private int year;
    private List<String> members;


    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
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
        band2.members.addAll(band1.members);
        band1.members.removeAll(band1.members);
    }

    public static void printMember(List <String> members) {
        System.out.println("Starring: " + members);
    }

    @Override
    public String toString() {
        return "Name of band: " + name + ", Year of foundation: " + year;
    }
}
