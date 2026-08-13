package project18;

import project18.game.Hero;
import project18.game.items.Armor;
import project18.game.items.Glass;
import project18.game.items.Sword;
import project18.game.items.Trash;
import project18.game.items.states.ItemType;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.getInventory().addItem(new Trash("Камень", 1));
        hero.getInventory().addItem(new Sword("Простой меч", 50, 5, 2));
        hero.getInventory().addItem(new Glass("Малое зелье лечения", 5, 10));
        hero.getInventory().addItem(new Glass("Большое зелье лечения", 15, 50));
        hero.getInventory().addItem(new Armor("Наплечники", 20, 3));

        Map<Class<? extends ItemType>, Integer> itemTypesCountMap = hero.getInventory().getItemTypesCountMap();
        System.out.println(itemTypesCountMap);
    }
}