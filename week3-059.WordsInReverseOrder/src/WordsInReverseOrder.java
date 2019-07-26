import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> list = new ArrayList<String>();
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            list.add(word);
            if(word.equals(""))break;
        }
        Collections.reverse(list);
        for(String word : list){
            System.out.println(word);
        }
    }
}
