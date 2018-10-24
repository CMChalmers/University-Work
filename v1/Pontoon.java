package v1;

import java.util.Scanner;

public class Pontoon {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // create two players, one is a dealer
        Player player = new Player("charlie");
        Dealer dealer = new Dealer("dealer");

        // two cards are dealt to each player
        dealer.dealCard(player, 2);
        dealer.dealCard(dealer, 2);

        // display both player objects
        System.out.println("\n" + player);
        System.out.println(dealer + "\n");

        String userChoice;

        do {
            System.out.print("Would you like to 'hit' or 'stick': ");
            userChoice = reader.nextLine();

            if (userChoice.equalsIgnoreCase("hit")){
                dealer.dealCard(player);
                System.out.println("\n" + player);
                System.out.println(dealer + "\n");
            } else {
                if (player.getHandValue() > dealer.getHandValue()){
                    System.out.println(player.getName() + " wins the game.");
                } else {
                    System.out.println(dealer.getName() + " wins the game.");
                }
            }

            if (player.getHandValue() > 21){
                System.out.println("You went bust.");
                System.out.println(dealer.getName() + " wins.");
                break;
            } else if (dealer.getHandValue() > 21){
                System.out.println("Dealer went bust");
                System.out.println(player.getName() + " wins.");
                break;
            } else if (dealer.getHandValue() > 21 && player.getHandValue() > 21){
                System.out.println(player);
                System.out.println(dealer);
                System.out.println("Both players bust. There are no winners.");
                break;
            }

        } while (userChoice.equalsIgnoreCase("hit"));
    }
}
