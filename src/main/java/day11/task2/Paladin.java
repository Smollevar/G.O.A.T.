package day11.task2;

import day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements Healer {
    public Paladin() {
        super.physicDeff = 0.5;
        magicDeff = 0.8;
        physAttck = 15;
    }

    @Override
    public void healYourself() {
        if (super.health <= MIN_HEALTH) {
            System.out.println("Вы не некромант, успокойтесь. Вы умерли.");
            return;
        } else if (super.health + 25 >= MAX_HEALTH) {
            super.health = MAX_HEALTH;
        }
        super.health += 25;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health <= MIN_HEALTH) {
            System.out.println("ОН МЕРТВ!");

        } else if (hero.health + 10 >= MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += 10;
        }
    }

    @Override
    public String toString() {
        return " Paladin{" +
                "health=" + health +
                '}';
    }
}
