
public class Player {
    private String playerName;
    private int goals;
    
    public Player(String name, int amount){
        this.playerName = name;
        this.goals = amount;
    }
    
    public Player(String name){
        this.playerName = name;
        this.goals = 0;
    }
    
    public String getName(){
        return playerName;
    }
    
    public int goals(){
        return goals;
    }
    
    public String toString(){
        return "" + this.playerName + ", goals " + this.goals;
    }
}
