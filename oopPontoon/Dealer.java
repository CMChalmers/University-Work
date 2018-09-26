package oopPontoon;

import java.util.Random;

public class Dealer {
    Random random = new Random();
    private int card;
    private int hand = 18;

    public int dealCard(){
        this.card = random.nextInt(10 - 1 + 1) + 1;
        return this.card;
    }

    public int getHand(){
        return this.hand;
    }
}
