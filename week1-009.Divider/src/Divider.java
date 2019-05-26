
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number :");
        int num = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number :");
        int num2 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Division: " + num + " / " + num2 + " = " + ((double)(num)/num2));
        // Implement your program here. Remember to ask the input from 3user.
    }
}
