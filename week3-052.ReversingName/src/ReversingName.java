import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = reader.nextLine(), reverseName = "";
        int length = name.length();
        while(length>0){
            reverseName+=name.charAt(length-1);
            length--;
        }
        System.out.print("In reverse order:" + reverseName);
        
    }
}
