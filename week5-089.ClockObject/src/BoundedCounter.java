

public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.value = 0;
        this.upperLimit = upperLimit;

    }
    
    public void next() {
        if(this.value == this.upperLimit){
            this.value = -1;
        }
        this.value++;
    }

    public String toString() {
        if(this.value<10)return "" + 0 + this.value;
        return "" + this.value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int newValue){
        if(newValue>0 && newValue<=this.upperLimit){
            this.value = newValue;
        }
    }
}
