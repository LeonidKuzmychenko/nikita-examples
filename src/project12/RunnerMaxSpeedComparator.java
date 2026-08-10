package project12;

import java.util.Comparator;

public class RunnerMaxSpeedComparator implements Comparator<Runner> {
    @Override
    public int compare(Runner o1, Runner o2) {
        if (o1 == null || o2 == null) {
            return Integer.MAX_VALUE;
        }
        if (o1.getMaxSpeed() == o2.getMaxSpeed()) {
            return (int) (o1.getTime() - o2.getTime());
        }
        return (int) (o2.getMaxSpeed() - o1.getMaxSpeed());
    }
}