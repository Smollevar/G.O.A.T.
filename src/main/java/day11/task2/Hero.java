package day11.task2;

import day11.task2.Interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {

    protected double health;
    double physicDeff;
    double magicDeff;
    int physAttck;
    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAttck;
        if (hero.health - attackScore <= MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
        hero.health = hero.health - (attackScore * hero.physicDeff);
    }}

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}
