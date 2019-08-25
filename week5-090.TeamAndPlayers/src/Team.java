import java.util.ArrayList;
import java.util.Collections;

public class Team {
    private String teamName;
    private ArrayList<Player> playerList;
    private int size;
    
    public Team(String name){
        this.teamName = name;
        this.playerList = new ArrayList<Player>();
        this.size = 16;
    }
    
    public String getName(){
        return this.teamName;
    }
    
    public void addPlayer(Player name){
        if(playerList.size() <= this.size)
            this.playerList.add(name);
    }
    
    public void printPlayers(){
        for(Player name: playerList){
            System.out.println(name);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.size = maxSize-1;
    }
    
    public int size(){
        return playerList.size();
    }
    
    public int goals(){
        int goals = 0;
        for(int i = 0; i<playerList.size(); i++){
            Player x = playerList.get(i);
            int amount = x.goals();
            goals+=amount;
        }
        return goals;
    }
            
}
