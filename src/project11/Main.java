package project11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println(set.add("a123"));//true
        System.out.println(set.add("b123"));//true
        System.out.println(set.add("c123"));//true
        System.out.println(set.add("a123"));//false
        System.out.println(set.add("e123"));//true
        System.out.println(set.add(null));//true

        System.out.println(set);//[a,b,c,e]
    }
}
