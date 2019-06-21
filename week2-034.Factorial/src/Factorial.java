import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int factorial =1;
        while(number!=1){
            factorial *= number;
            number--;
        }
        System.out.print("The facotrial is" + factorial);
    }
}
