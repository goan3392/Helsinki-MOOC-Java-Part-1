import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int num = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        if(num > num2) {
            System.out.print("Greater number: " + num);
        } else if(num2>num) {
            System.out.print("Greater number: " + num2);
        } else {
            System.out.print("The numbers are equal!");
        }
    }
}
