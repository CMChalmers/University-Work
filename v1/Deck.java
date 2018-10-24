package v1;

import java.util.Random;

public class Deck {
    private Card card;
    private Random rand;

    public Deck(){
        this.rand = new Random();
    }

    public Card draw(){
        // returns a card with a value of 1-10
        this.card = new Card(rand.nextInt(10) + 1);
        return this.card;
    }
}
