package day11.task2;


public class Warrior extends Hero {

    public Warrior() {
        super.physicDeff = 0.2;
        magicDeff = 1;
        physAttck = 30;
    }

    @Override
    public String toString() {
        return " Warrior{" +
                "health=" + health +
                '}';
    }
}
