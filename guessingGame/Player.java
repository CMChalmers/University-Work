public class Player {
    int userInput = 0; // where the guess goes
    Scanner reader = new Scanner(System.in);

    public void guess(){
        System.out.println("Please enter a number between 1 and 10: ");
        // take input and cast to type int
        userInput = Integer.parseInt(reader.next());
        System.out.println("I'm guessing " + userInput);
    }
}
