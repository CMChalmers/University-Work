package v1;

import java.util.ArrayList;

public class Player {
    private String mName;
    private ArrayList<Integer> hand;
    private int handValue;

    public Player(String name){
        setName(name);
        this.hand = new ArrayList();
        this.handValue = 0;
    }

    public void addToHand(Card card){
        this.hand.add(card.getValue());
    }

    public int getHandValue(){
        // calculates the total value of the cards in users hands
        this.handValue = 0;
        for(int item : hand){
            this.handValue += item;
        }
        return this.handValue;
    }

    public void setName(String name){
        // capitalises the first letter of the name and sets it
        String capitalised = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.mName = capitalised;
    }

    public String getName(){
        return this.mName;
    }

    public String toString(){
        return this.mName + " : Hand-" + this.hand + " : Total-" + this.getHandValue();
    }
}
