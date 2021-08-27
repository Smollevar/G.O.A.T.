package day11.task2;

import day11.task2.Interfaces.MagicAttack;


public class Magican extends Hero implements MagicAttack {
    private final double magicalAttack;

    public Magican() {
        super.physicDeff = 1;
        magicDeff = 0.2;
        physAttck = 5;
        this.magicalAttack = 20;
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
        return " Magican{" +
                "health=" + health +
                '}';
    }
}
