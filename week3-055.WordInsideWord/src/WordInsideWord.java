
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = reader.nextLine();
        System.out.print("Enter second word: ");
        String word2 = reader.nextLine();
        if(word1.indexOf(word2) == -1){
            System.out.print("The word '" + word2 + "' is not found in the word '" + word1+ "'.");
        } else {
            System.out.print("The word '" + word2 + "' is found in the word '" + word1 + "'.");
        }
    }
}
