package starWars;

import java.util.Scanner;

public class Detail {
    // gets a user detail and returns it
    private String value;
    private Scanner reader;

    public Detail(String type){
        /* asks user to enter a
        // specified personal detail
        */
        reader = new Scanner(System.in);
        System.out.println("Please enter your " + type.toLowerCase() + ".");
        this.value = reader.nextLine();
    }

    public String getValue(){
        // returns the user value in lower case form
        return this.value.toLowerCase();
    }
}
