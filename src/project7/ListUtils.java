package project7;

import java.util.List;

public class ListUtils {

    public static void printList(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ") " + list.get(i));
        }
    }
}
