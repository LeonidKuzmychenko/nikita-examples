package project13;

import project12.RunnerMaxSpeedComparator;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        int ordinal = RainbowColor.ORANGE.ordinal();
        System.out.println("Rainbow color ordinal: " + ordinal);

        Set<RainbowColor> rainbowColors = new TreeSet<>(new RainbowColorComparator());

        rainbowColors.add(RainbowColor.GREEN);
        rainbowColors.add(RainbowColor.YELLOW);
        rainbowColors.add(RainbowColor.RED);

        System.out.println(rainbowColors);

    }
}
