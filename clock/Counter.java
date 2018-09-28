package clock;

public class Counter {
    private int value;
    private int upperLimit;

    public Counter(int valueAtStart){
        this.value = valueAtStart;
        this.upperLimit = 59;
    }

    public Counter(int valueAtStart, int upperLimit){
        this.value = valueAtStart;
        this.upperLimit = upperLimit;
    }

    public void incrementValue(){
        if(this.value == upperLimit){
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public String toString() {
        if(this.value < 10){
            return "0" + this.value;
        }
        return "" + this.value;
    }
}
