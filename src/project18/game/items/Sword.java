package project18.game.items;

import project18.game.Item;
import project18.game.items.states.Attack;
import project18.game.items.states.Defence;

public class Sword extends Item implements Attack, Defence {

    private final int attackValue;
    private final int armor;

    public Sword(String name, int price, int attackValue, int armor) {
        super(name, price);
        this.attackValue = attackValue;
        this.armor = armor;
    }

    @Override
    public void attack() {
        System.out.println("You are attacking " + this.attackValue + " damage!");
    }


    @Override
    public int getArmor() {
        return this.armor;
    }
}
