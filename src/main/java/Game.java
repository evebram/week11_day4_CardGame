import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {
        Player player1 = new Player("Boris");
        Player player2 = new Player("Jeremy");
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);

        Deck deck = new Deck();
        deck.shuffleCards();

        for (Player player : players){
            player.addCard(deck.dealCard());
        }

        Player winningPlayer = players.get(0);

        for( int i = 1 ; i < players.size() ; i++){
            if(players.get(i).getCardValue() > winningPlayer.getCardValue()){
                winningPlayer = players.get(i);
            }
        }

        System.out.println(String.format("%s is the winner with %s of %s ", winningPlayer.getName(), winningPlayer.getCard().getRank(), winningPlayer.getCard().getSuit()));

    }

}
