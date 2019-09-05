import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Boris");
        card = new Card(Suit.HEARTS, Rank.EIGHT);
    }

    @Test
    public void testAddCard(){
        player.addCard(card);
        assertEquals(1, player.getHandSize());

    }

    @Test
    public void testPlayCard(){
        player.addCard(card);
        assertEquals(8, player.getCardValue());
    }

}
