package project16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<String, Number> pair = new Pair<>("Hitman", 47);
        System.out.println(pair);

        List<Integer> number = new ArrayList<>();
        number.add(77);
        number.add(78);
        number.add(79);
        number.add(710);
        number.add(711);

        List<Integer> number1 = ArrayUtils.swap(number, 0, 1);
        System.out.println(number1);


    }
}
