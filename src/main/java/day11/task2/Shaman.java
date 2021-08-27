package day11.task2;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {
    private final double magicalAttack;

    public Shaman() {
        super.physicDeff = 0.8;
        magicDeff = 0.8;
        physAttck = 10;
        this.magicalAttack = 15;
    }

    @Override
    public void healYourself() {
        if (super.health <= MIN_HEALTH) {
            System.out.println("Успокойтесь. Вы умерли.");
        } else if (super.health + 50 >= MAX_HEALTH) {
            super.health = MAX_HEALTH;
        } else {
            super.health += 50;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health <= MIN_HEALTH) {
            System.out.println("ОН МЕРТВ!");
        } else if (hero.health + 30 >= MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += 30;
        }
    }

    public void magicalAttack(Hero hero) {
        double attackScore = magicalAttack;
        if (hero.health - attackScore < MIN_HEALTH) {
            health = MIN_HEALTH;
        }
        hero.health = hero.health - (attackScore * hero.magicDeff);
    }

    @Override
    public String toString() {
        return " Shaman{" +
                "health=" + health +
                '}';
    }
}
