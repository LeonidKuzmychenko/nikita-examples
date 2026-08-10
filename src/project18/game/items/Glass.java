package project18.game.items;

import project18.game.Hero;
import project18.game.Item;
import project18.game.items.states.Healing;
import project18.game.items.states.Usable;

public class Glass extends Item implements Healing, Usable {

    private final int healValue;

    public Glass(String name, int price, int healValue) {
        super(name, price);
        this.healValue = healValue;
    }

    @Override
    public int getHeal() {
        return healValue;
    }

    @Override
    public void use(Hero hero) {
        int newXP = Math.min(hero.getMaxXP(), hero.getCurrentXP() + getHeal());
        hero.setCurrentXP(newXP);
    }
}
