
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = Integer.parseInt(reader.nextLine());
        int power =0, sum =0;
        while(power<=number){
            sum+=Math.pow(2,power);
            power++;
        }
        System.out.print("Result: " + sum);
    }
}
