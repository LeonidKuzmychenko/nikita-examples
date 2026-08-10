package project14;

public class BlackBox<V> {

    private V value;

    public BlackBox(V value) {
        this.value = value;
    }

    public  V getValue() {
        return value;
    }

    public void setValue(V value) {

    }

    public void setValue(String value) {

    }

    @Override
    public String toString() {
        return "BlackBox{" +
                "value=" + value +
                '}';
    }


}
