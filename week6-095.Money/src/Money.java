
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        int cash = this.euros;
        cash+=added.euros;
        int coins = this.cents;
        coins+=added.cents;
        Money newAmount = new Money(cash, coins);
        return newAmount;
    }

    public boolean less(Money comparedAmount){
        int cash = this.euros;
        int coins = this.cents;
        
        if(cash < comparedAmount.euros) return true;
        else if(cash == comparedAmount.euros && coins < comparedAmount.cents) return true;
        return false;
    }
    
    public Money minus(Money amount){
        Money zeroAmount = new Money(0, 0);
        int cashOriginal = this.euros*100 + this.cents;
        int cashAmount = amount.euros*100 + amount.cents;
        int difference = cashOriginal - cashAmount;
        if(difference <= 0) return zeroAmount;
        
        Money newOriginal = new Money(difference/100, difference%100);
        return newOriginal;
       
    }
}
