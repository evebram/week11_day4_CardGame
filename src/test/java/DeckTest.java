import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}