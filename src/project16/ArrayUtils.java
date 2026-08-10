package project16;

import java.util.List;

public class ArrayUtils {

    public static <T> List<T> swap(List<T> list, int i, int j) {
        if (i < 0 || j < 0 || i >= list.size() || j >= list.size()) {
            return list;
        }
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
        return list;
    }

    public static <V> V geTLast(List<V> list) {
        if (list.isEmpty()) return null;
        return list.get(list.size() - 1);
    }

}
