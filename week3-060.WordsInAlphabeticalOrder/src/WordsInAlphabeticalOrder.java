
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> list = new ArrayList<String>();
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if(word.equals(""))break;
            list.add(word);
            
        }
        System.out.println("You printed the following words: ");
        Collections.sort(list);
        for(String word : list){
            System.out.println(word);
        }
    }
}
