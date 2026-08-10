package project13;

import project12.Runner;

import java.util.Comparator;

public class RainbowColorComparator implements Comparator<RainbowColor> {
    @Override
    public int compare(RainbowColor o1, RainbowColor o2) {
        return o2.getRainbowNumber() - o1.getRainbowNumber();
    }
}
