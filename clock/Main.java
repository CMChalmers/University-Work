package clock;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        GregorianCalendar calendar = new GregorianCalendar();
        Scanner reader = new Scanner(System.in);

        System.out.println("Would you like a 12hr clock, or a 24hr clock.\n1. 12\n2. 24\n");
        int userChoice = Integer.parseInt(reader.next());

        ClockDisplay clock1;

        switch(userChoice){
            case 12:
                clock1 = new ClockDisplay(calendar.get(calendar.HOUR), calendar.get(calendar.MINUTE), calendar.get(calendar.SECOND));
                break;
            case 24:
                clock1 = new ClockDisplay(calendar.get(calendar.HOUR_OF_DAY), calendar.get(calendar.MINUTE), calendar.get(calendar.SECOND));
                break;
            default:
                clock1 = new ClockDisplay(calendar.get(calendar.HOUR_OF_DAY), calendar.get(calendar.MINUTE), calendar.get(calendar.SECOND));
        }

        System.out.println(clock1);

        for(int i = 0; i < 300; i++){
            clock1.clockTick(1);
            Thread.sleep(1000);
            System.out.println(clock1);
        }
    }
}

