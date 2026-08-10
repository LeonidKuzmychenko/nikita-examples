package project4;

public class Player {
    private String name;
    private String hand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public Player(String name, String hand) {
        this.name = name;
        this.hand = hand;
    }

    @Override
    public String toString() {
        return name + " " + hand;
    }

}



