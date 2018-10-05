package starWars;

public class GameDisplay {
    /* creates each Detail required for the game
    // and formats the required output
    // depending on the rules of the game
    */
    private Detail firstName;
    private Detail lastName;
    private Detail maidenName;
    private Detail placeOfBirth;
    private String holder = "";

    public GameDisplay(){
        /* initializes four Detail objects and
        // gives each a string value to be printed
        // to the user
        */

        firstName = new Detail("first namE");
        lastName = new Detail("Last nAme");
        maidenName = new Detail("mothers maiden name");
        placeOfBirth = new Detail("placE of birth");
    }

    public String toString(){
        // formats the output for the game and returns it.
        this.holder += firstName.getValue().substring(0, 2);
        this.holder += lastName.getValue().substring(0, 3) + " ";
        this.holder += placeOfBirth.getValue().substring(0, 3);
        this.holder += maidenName.getValue().substring(0, 2);
        return this.holder;
    }
}
