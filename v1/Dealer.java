package v1;

public class Dealer extends Player {
    private Deck deck;

    public Dealer(String name){
        super(name);
        this.deck = new Deck();
    }

    public void dealCard(Player player){
        // draws a card from the deck and adds it to players hand
        Card card = deck.draw();
        player.addToHand(card);
    }

    public void dealCard(Player player, int num){
        // deals a specified number (num) of cards
        for(int i = 0; i < num; i++){
            Card card = deck.draw();
            player.addToHand(card);
        }
    }
}
