import java.util.*;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public int compareTo(Hand o) {
        return this.cards.stream().mapToInt(Card::getValue).sum() - o.getCards().stream().mapToInt(Card::getValue).sum();
    }

    public void sortBySuit() {
        SortBySuit sortBySuit = new SortBySuit();
        BySuitInValueOrder suitValue = new BySuitInValueOrder();
        Collections.sort(this.cards, suitValue);
        Collections.sort(this.cards, sortBySuit);
    }

}
