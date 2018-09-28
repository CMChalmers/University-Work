package clock;

public class ClockDisplay {
    private Counter hours;
    private Counter minutes;
    private Counter seconds;

    public ClockDisplay(int hoursAtStart, int minutesAtStart, int secondsAtStart){
        this.hours = new Counter(hoursAtStart, 23);
        this.minutes = new Counter(minutesAtStart);
        this.seconds = new Counter(secondsAtStart);
    }

    public void clockTick(int ticks){
        for(int i = 0; i < ticks; i++){
            if(this.minutes.getValue() == 59 && this.seconds.getValue() == 59){
                this.hours.incrementValue();
            }
            if(this.seconds.getValue() == 59){
                this.minutes.incrementValue();
            }
            this.seconds.incrementValue();
        }
    }

    public String toString(){
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
