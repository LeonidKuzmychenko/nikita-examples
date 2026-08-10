package project18.game;

import project18.game.items.states.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    private final List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int sumPrices() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public Map<Class<? extends ItemType>, Integer> getItemTypesCountMap() {
        Map<Class<? extends ItemType>, Integer> map = new HashMap<>();
        for (Item item : items) {
            if (item instanceof Attack) {
                map.put(Attack.class, map.getOrDefault(Attack.class, 0) + 1);
            }
            if (item instanceof Defence) {
                map.put(Defence.class, map.getOrDefault(Defence.class, 0) + 1);
            }
            if (item instanceof Healing) {
                map.put(Healing.class, map.getOrDefault(Healing.class, 0) + 1);
            }
            if (item instanceof Usable) {
                map.put(Usable.class, map.getOrDefault(Usable.class, 0) + 1);
            }
        }
        return map;
    }

    public int sumArmor() {
        int sum = 0;
        for (Item item : items) {
            if (item instanceof Defence defence) {
                sum += defence.getArmor();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items +
                '}';
    }
}
