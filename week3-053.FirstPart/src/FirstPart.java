
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Typae a word: ");
        String word = reader.nextLine();
        System.out.print("Length of first part: ");
        int length = Integer.parseInt(reader.nextLine());
        String sub = word.substring(0,length);
        System.out.print("Result: " + sub);
    }
}
