package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();
        Magican magican = new Magican();
        warrior.physicalAttack(paladin);
        System.out.println(paladin.toString() + warrior.toString() + shaman.toString() + magican.toString());
        paladin.physicalAttack(magican);
        System.out.println(paladin.toString() + warrior.toString() + shaman.toString() + magican.toString());
        shaman.healTeammate(magican);
        System.out.println(paladin.toString() + warrior.toString() + shaman.toString() + magican.toString());
        magican.magicalAttack(paladin);
        System.out.println(paladin.toString() + warrior.toString() + shaman.toString() + magican.toString());
        shaman.physicalAttack(warrior);
        System.out.println(paladin.toString() + warrior.toString() + shaman.toString() + magican.toString());
        paladin.healYourself();
        System.out.println(paladin.toString() + warrior.toString() + shaman.toString() + magican.toString());

        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magican);

            System.out.println(paladin.toString() + warrior.toString() + shaman.toString() + magican.toString());
        }

    }
}
