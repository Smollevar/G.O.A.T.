package TestArrayList;

import java.util.List;

public class Girl {
    private String name;
    private int age;
    private List<Doll> dolls; // Изначально ссылается на null


    // Конструктор со всеми аргументами
    public Girl(String name, int age, List<Doll> dolls) {
        this.name = name;
        this.age = age;
        this.dolls = dolls;
    }

    // Геттеры / Сеттеры

    public List<Doll> getDolls() {
        return dolls;
    }

    public void setDolls(List<Doll> dolls) {
        this.dolls = dolls;
    }
}
