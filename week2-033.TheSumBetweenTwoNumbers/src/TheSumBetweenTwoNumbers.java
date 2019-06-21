
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Enter second number: ");
        int second = Integer.parseInt(reader.nextLine());
        int sum = 0;
        while(first<=second){
            sum +=first;
            first++;
        }
        System.out.print("The sum:" + sum);
    }
}
