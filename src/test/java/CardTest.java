import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;

    @Before
    public void before(){
        this.card = new Card(Suit.DIAMONDS, Rank.ACE);
    }

    @Test
    public void testGetSuit(){
        assertEquals(Suit.DIAMONDS, card.getSuit());
    }

    @Test
    public void testGetRank(){
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void testGetValue(){
        assertEquals(1, card.getRankValue());
    }

}
