import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int getCardCount() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void addAllCards() {
        for (SuitType suit:
             SuitType.values()) {
            for (RankType rank:
                 RankType.values()) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public Card findCard(int index) {
        return this.cards.get(index);
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card dealCard(){
        Card cardToDeal = this.cards.get(0);
        this.cards.remove(0);
        return cardToDeal;
    }
}
