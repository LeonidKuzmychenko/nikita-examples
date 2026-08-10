package project3;

public class PlayCard {
    private final String name;
    private final String suit;
    private final boolean trump;
    private final int rank;

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public boolean isTrump() {
        return trump;
    }

    public String getName() {
        return name;
    }

    public PlayCard(String name, String suit, boolean trump, int rank) {
        this.name = name;
        this.suit = suit;
        this.trump = trump;
        this.rank = rank;
    }

    public boolean canBeat (PlayCard other) {
        if (this.trump && !other.trump) {
            return true;
        }
        if (!this.trump && other.trump) {
            return false;
        }
        if (this.trump && other.trump) {
            return this.rank > other.rank;
        }
        if (this.suit.equals(other.suit)) {
            return this.rank > other.rank;
        }
        return false;
    }
}

