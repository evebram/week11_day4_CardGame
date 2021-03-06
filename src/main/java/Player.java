import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName(){
        return this.name;
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public int getHandSize(){
        return hand.size();
    }

    public int getCardValue(){
        return hand.get(0).getRankValue();
    }

    public Card getCard(){
        return hand.get(0);
    }

}
