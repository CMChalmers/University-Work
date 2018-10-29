package week6_problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
    private String date;
    private ArrayList<Person> attending;
    private Scanner reader = new Scanner(System.in);

    public Booking(){
        setDate();
        attending = new ArrayList();
    }

    public Booking(String cDate){
        this.date = cDate;
        attending = new ArrayList();
    }

    public void setDate(){
        System.out.print("Date: ");
        String userInput = reader.nextLine();
        this.date = userInput;
    }

    public String getDate(){
        return this.date;
    }

    public void addPerson(Person mPerson){
        attending.add(mPerson);
    }

    public String displayMembers(){
        // display members based on membership type
        System.out.print("Member type to show: ");
        String userChoice = reader.nextLine();
        String builder = "\nDate: " + this.getDate() + "\nAttending: ";
        for(Person item : this.attending){
            if(item.getMemberType().equalsIgnoreCase(userChoice)){
                builder += "\n" + item.toString();
            }
        }
        return builder;
    }

    public String toString(){
        String builder =  "\nDate: " + this.getDate() + "\nAttending: ";
        for(Person item : this.attending){
            builder += "\n" + item.toString();
        }
        return builder;
    }
}
