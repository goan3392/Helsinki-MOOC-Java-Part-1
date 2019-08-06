import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int size = 0;
        String password = "", symbol= "abcdefghijklmnopqrstuvwxyz";
        while(size<this.length){
            password+=symbol.charAt((this.random.nextInt(25)+1));
            size++;
        }
        return password;
    }
}
