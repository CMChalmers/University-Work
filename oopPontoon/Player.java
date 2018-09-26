package oopPontoon;
import java.util.ArrayList;

public class Player {
    private int hand;
    private ArrayList<Integer> cards;
    private int wins;

    public Player(){
        this.hand = 0;
        this.wins = 0;
    }

    public void setHand(int cardValue){
        this.hand += cardValue;
        setCards(cardValue);
    }

    public int getHand(){
        return this.hand;
    }

    public void resetHand(){
        this.hand = 0;
    }

    public void createCards(){
        this.cards = new ArrayList();
    }

    public void setCards(int card){
        this.cards.add(card);
    }

    public void clearCards(){
        this.cards.clear();
    }

    public ArrayList<Integer> getCards(){
       return this.cards;
    }

    public void incrementWins(){
        this.wins++;
    }

    public int getWins(){
        return this.wins;
    }

    public String toString(){
        return "Hand: " + getCards() + ", Total: " + getHand();
    }
}
