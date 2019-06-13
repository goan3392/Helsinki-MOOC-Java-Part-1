
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int count = 0;
        while(count<number){
            count++;
            System.out.println(count);
            
        }
        // Write your code here
        
    }
}
