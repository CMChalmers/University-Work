package week6_problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class Court {
    private ArrayList<Booking> bookings;
    private int courtNo;
    private Scanner reader = new Scanner(System.in);

    public Court(int courtNo){
        this.bookings = new ArrayList();
        this.courtNo = courtNo;
    }

    public void addBooking(Booking mBooking){
        this.bookings.add(mBooking);
    }

    public void showBooking(){
        // display a specific booking using date
        System.out.print("Enter booking date: ");
        String userInput = reader.nextLine();
        for(Booking item : bookings){
            if(item.getDate().equalsIgnoreCase(userInput)){
                System.out.println(item);
            }
        }
    }

    public void showBookings(){
        // display all booking for the court
        for(Booking item : bookings){
            System.out.println(item);
        }
    }
}
