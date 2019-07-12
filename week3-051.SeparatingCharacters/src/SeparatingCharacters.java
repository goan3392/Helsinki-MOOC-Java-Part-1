
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = reader.nextLine();
        int character = 0, number = 1, length = name.length();
        while(length>0){
            System.out.println(number + ". character: " + name.charAt(character));
            character++;
            length--;
            number++;
        }
    }
}
