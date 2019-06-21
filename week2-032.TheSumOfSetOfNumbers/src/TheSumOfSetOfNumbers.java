
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what: ");
        int number = Integer.parseInt(reader.nextLine());
        int count  = 1, sum = 0;
        while(true){
            sum+=count;            
            if(count == number )break;
            count++;
        }
        System.out.println("Sum is " + sum);

    }
}
