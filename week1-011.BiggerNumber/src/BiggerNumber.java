
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        System.out.print("The bigger number of the two numbers given was: ");
        if(number>=number2) System.out.print(number);
        else System.out.print(number2);

        // Implement your program here. Remember to ask the input from user
    }
}
