
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String pass = "";
        while(!pass.equals("carrot")){
            System.out.print("Enter a password: ");
            pass = reader.nextLine();
            if(!pass.equals("carrot")){
                System.out.println("Wrong!");
            }
        }
        System.out.println("Right");
        System.out.println("The secret is: jryy qbar!");
        

        // Write your code here
    }
}
