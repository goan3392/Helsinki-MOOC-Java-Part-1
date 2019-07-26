
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        // create here the ArrayList 
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if(list.contains(word)){
                System.out.println("You gave the work " + word + " twice.");
                break;
            }
            list.add(word);
            
            
        }
        
    }
}
