package oopPontoon;

import java.util.ArrayList;
import java.util.Scanner;

public class GameLauncher {

    public static boolean isBust(int hand){
        // checks to see if the player is bust (above 21)
        if(hand > 21){
           return true;
        }
        return false;
    }

    public static boolean isWin(int hand){
        // checks to see if players hand is between 19 and 21 - inclusive
        if(hand > 18 && hand < 22) {
            return true;
        }
        return false;
    }

    public static boolean isPontoon(int hand){
        // checks to see if players hand is equal to 21
        if (hand == 21){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // objects
        Scanner reader = new Scanner(System.in);
        Dealer dealer1 = new Dealer();
        ArrayList<ArrayList<Integer>> multiArray = new ArrayList();
        Player player1 = new Player();

        // variables
        String userChoice;
        int gamesPlayed = 1;

        // game loop
        while (gamesPlayed < 6) {

            // create new cards ArrayList
            player1.createCards();

            System.out.println("\nThis is game number " + gamesPlayed);
            multiArray.add(player1.getCards());
            player1.clearCards();
            player1.resetHand();

            player1.setHand(dealer1.dealCard());
            player1.setHand(dealer1.dealCard());

            System.out.println(player1);

            // hit or stick loop
            do {
                System.out.println("Would you like to hit, or stick?");
                userChoice = reader.nextLine();
                if (userChoice.equalsIgnoreCase("hit")) {
                    player1.setHand(dealer1.dealCard());
                    System.out.println(player1);
                    if (player1.getHand() >= 21) {
                        break;
                    }
                }
            } while (userChoice.equalsIgnoreCase("hit"));

            // create a hand variable for DRY reasons
            int hand = player1.getHand();

            if (isPontoon(hand)) {
                System.out.println("Pontoon!");
                player1.incrementWins();
            } else if (isWin(hand)) {
                System.out.println("You win with " + hand + ".");
                player1.incrementWins();
            } else if (isBust(player1.getHand())) {
                System.out.println("You went bust with " + hand + ".");
            } else {
                System.out.println("You lose with " + hand + ". The dealers hand "
                        + dealer1.getHand() + ".");
            }

            // check to see multiArray is building correctly
            System.out.println("\n" + multiArray);

            // increment gamesPlayed
            gamesPlayed++;
        }
        System.out.println("Games won: " + player1.getWins() + "\n");
    }
}
