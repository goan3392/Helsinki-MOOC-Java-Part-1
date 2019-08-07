
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int startingValue, boolean Check){
        this.value = startingValue;
        this.check = Check;
    }
    
    public Counter(int startingValue){
        this.value = startingValue;        
    }
    
    public Counter(boolean check){
        this.value = 0;
        this.check = check;
    }
    
    public Counter(){
        this.value = 0;
    }
    
    //methods
    public int value(){
        return this.value;
    }
    
    public void increase(){
        this.value++;
    }
    
    public void increase(int amount){
        if(amount>0){
            this.value+=amount;
        }
    }
    
    public void decrease(){
        if(this.check == true && this.value == 0){
            //
        } else {
            this.value--;
        }
    }
    
    public void decrease(int amount){
        if(this.check == true && this.value<=0){
            //
        }else if(amount>0 && this.value-amount<=0 && this.check==true){
            this.value=0;
        }else if(amount<0){
            //
        }else{
            this.value-=amount;
        }
    }
    
    
}
