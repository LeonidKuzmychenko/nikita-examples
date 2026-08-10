package project14;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BlackBox<String> blackBox = new BlackBox<>("5");
    }

    public static double pow2(BlackBox<? extends Number> blackBox) {
        return 0.;
    }

    public static <T extends Number> double pow3(T a) {
        return Math.pow(a.doubleValue(), 3);
    }
}
