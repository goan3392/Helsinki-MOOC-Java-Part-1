
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("Number of characters: " + calculateCharacters(name));
    }
    
    public static int calculateCharacters(String name){
        return name.length();
    }
    // do here the method
    // public static int calculateCharacters(String text)
    
}
