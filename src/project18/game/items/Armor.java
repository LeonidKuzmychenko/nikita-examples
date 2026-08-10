package project18.game.items;

import project18.game.Item;
import project18.game.items.states.Defence;

public class Armor extends Item implements Defence {

    private final int armor;

    public Armor(String name, int price, int armor) {
        super(name, price);
        this.armor = armor;
    }

    @Override
    public int getArmor() {
        return armor;
    }
}
