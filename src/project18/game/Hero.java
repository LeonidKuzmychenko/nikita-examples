package project18.game;

import project18.game.items.states.Usable;

public class Hero {

    private int currentXP;
    private int maxXP;
    private final Inventory inventory;

    public Hero() {
        this.inventory = new Inventory();
        this.maxXP = 20;
        this.currentXP = this.maxXP;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public int getCurrentXP() {
        return currentXP;
    }

    public void setCurrentXP(int currentXP) {
        this.currentXP = currentXP;
    }

    public int getMaxXP() {
        return maxXP;
    }

    public void setMaxXP(int maxXP) {
        this.maxXP = maxXP;
    }

    public void takeDamage(int damage){
        int sumArmor = this.getInventory().sumArmor();
        if (damage <= sumArmor){
            return;
        }
        int newXp = this.currentXP + sumArmor - damage;
        this.currentXP = Math.max(newXp, 0);
    }

    public void useItem(Item item){
        if (item instanceof Usable usable){
            usable.use(this);
            return;
        }
        System.out.println("You can not use this item");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "currentXP=" + currentXP +
                ", maxXP=" + maxXP +
                ", inventory=" + inventory +
                '}';
    }
}
