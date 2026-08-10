package project3;

public class Main {
    public static void main(String[] args) {
        Jack jack = new Jack("diamond", true);
        King king = new King("diamond", true);
        Queen queen = new Queen("hearts", false);

//        PlayCard[] cards = {jack, king, queen};
//        for (int i = 0; i < cards.length - 1; i++) {
//            boolean result = cards[i].canBeat(cards[i + 1]);
//            System.out.println("Карта " + cards[i].getName() + " " +cards[i].getSuit() + " побить " + cards[i + 1].getName() + " " + cards[i +1].getSuit() + " " + result);
//        }
        PlayCard[] cards = {jack, queen, king};
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                if (i != j) {
                    boolean result = cards[i].canBeat(cards[j]);
                    System.out.println("Может ли карта " + cards[i].getName() + " " + cards[i].getSuit() + " побить " + cards[j].getName() + " " + cards[j].getSuit() + "? -> " + result);

                }
            }
        }
    }
}