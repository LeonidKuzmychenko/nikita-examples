package project10;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //List
        //Может хранить дубликаты
        //Сохраняется последовательность записи
        List<String> list1 = List.of("Соня", "Аня", "Вика");
        List<String> list2 = List.of("Сoня", "Вика");

        //HashSet
        //Не хранит дубликаты
        //Не сохраняет последовательность записи
        Set<String> resultList = new LinkedHashSet<>();

        //LinkedHashSet
        //Не хранит дубликаты
        //Сохраняет последовательность записи
        resultList.addAll(list1);
        resultList.addAll(list2);

        System.out.println(resultList);
    }
}
