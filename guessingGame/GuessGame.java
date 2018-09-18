package guessingGame;

public class GuessGame {
    Player p1;

    public void startGame(){
        p1 = new Player();

        int guessp1 = 0;

        boolean p1isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Number to guess is " + targetNumber);

        p1.guess();

        guessp1 = p1.userInput;
        System.out.println("You guessed " + guessp1);

        if(guessp1 == targetNumber){
            p1isRight = true;
        }

        if(p1isRight){
            System.out.println("We have a winner!");
            System.out.println("You got it right? " + p1isRight);
            System.out.println("Game is over.");
        } else {
            System.out.println("You will have to try again.");
        }
    }
}
