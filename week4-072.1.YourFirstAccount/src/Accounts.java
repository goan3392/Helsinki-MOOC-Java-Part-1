
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account antoAccount = new Account("Anto", 100.0);
        antoAccount.deposit(20);
        
        System.out.println("Initial state");
        System.out.println(antoAccount);
    }

}
