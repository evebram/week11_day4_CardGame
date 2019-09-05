import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        this.deck = new Deck();
    }

    @Test
    public void checkDeck(){
        assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void checkShuffleDeck(){
        ArrayList<Card> originalDeck = new ArrayList<Card>(deck.getDeck());
        deck.shuffleCards();
        assertNotEquals(originalDeck, deck.getDeck());
    }
}
