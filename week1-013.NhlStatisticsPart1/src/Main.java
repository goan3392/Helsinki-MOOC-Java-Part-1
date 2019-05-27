
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Top ten by goal");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top twenty-five by penalty amount");
        NHLStatistics.sortByPenalties(); 
        NHLStatistics.top(25);
        
        NHLStatistics.searchByPlayer("Sidney Crosby");
        NHLStatistics.teamStatistics("PHI"); 
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
