import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        deck = populateDeck();
    }

    private ArrayList<Card> populateDeck(){
        ArrayList<Card> cards = new ArrayList<Card>();
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                cards.add(new Card(suit, rank));
            }
        }
        return cards;
    }

    public int getDeckSize(){
        return deck.size();
    }
}
