package project12;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Runner> set = new TreeSet<>(new RunnerMaxSpeedComparator());

        set.add(new Runner(20., 30));
        set.add(new Runner(17., 25));
        set.add(new Runner(17., 22));
        set.add(new Runner(17., 22));

        System.out.println(set);

//        set.add(15);
//        set.add(21);
//        set.add(12);
//        set.add(14);
//        set.add(19);

//        set.add("7Леонид");
//        set.add("6Никита");
//        set.add("5Аня");
//        set.add("4Толик");
//        set.add("3Соня");
//        set.add("2Егор");


    }
}
