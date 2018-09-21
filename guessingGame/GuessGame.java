package guessingGame;

public class GuessGame {
    // initialize player object
    Player p1;

    public void startGame(){
        // create new player object
        p1 = new Player();

        int guessp1 = 0;

        boolean p1isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Number to guess is " + targetNumber);

        while (p1.userInput != targetNumber){
            // loops through game-play loop until user input is equal to the target number.
            p1.guess();

            guessp1 = p1.userInput;
            System.out.println("You guessed " + guessp1);

            if (guessp1 == targetNumber){
                // check that guess is equal to random number
                p1isRight = true;
            }

            if (p1isRight){
                // what happens if guess is equal to random number
                System.out.println("We have a winner!");
                System.out.println("You got it right? " + p1isRight);
                System.out.println("Game is over.");
            } else {
                System.out.println("You will have to try again.");
            }
        } // end of while loop
    } // end of main argument
} // end of class
