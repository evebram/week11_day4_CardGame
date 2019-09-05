import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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

    public void shuffleCards(){
        Collections.shuffle(deck, new Random());
    }

    public ArrayList<Card> getDeckCopy(){
        return new ArrayList<Card>(this.deck);
    }

    public Card dealCard(){
        return deck.remove(0);
    }
}
