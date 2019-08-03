

public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }
    
    public String toString(){
        return "The card has " + this.balance + " Euros";
    }
    
    public void payEconomical(){
        if(this.balance>=2.5)
            this.balance-=2.50;
    }
    
    public void payGourmet(){
        if(this.balance >= 4)
            this.balance-=4;
    }
    
    public void loadMoney(double amount){
        if(this.balance+amount>=150){
            this.balance = 150;
        } else if(amount<0){
            //
        }else{
            this.balance+=amount;
        }
    }
    
}
