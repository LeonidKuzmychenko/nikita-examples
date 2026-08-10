package project6;

import java.util.List;

public class Hero {

    private List<Barrier> barriers;

    public Hero(List<Barrier> barriers) {
        this.barriers = barriers;
    }

    public List<Barrier> getBarriers() {
        return barriers;
    }

    public void setBarriers(List<Barrier> barriers) {
        this.barriers = barriers;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "barriers=" + barriers +
                '}';
    }
}
