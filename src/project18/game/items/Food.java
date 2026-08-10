package project18.game.items;

import project18.game.Hero;
import project18.game.Item;
import project18.game.items.states.Healing;
import project18.game.items.states.Usable;

public class Food extends Item implements Healing, Usable {

    private final int heal;

    public Food(String name, int price,  int heal) {
        super(name, price);
        this.heal = heal;
    }

    @Override
    public int getHeal() {
        return this.heal;
    }

    @Override
    public void use(Hero hero) {

    }
}
