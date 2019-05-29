
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        double num;

        int days = 0;
        while(true){
            if(days == 9)break;
            System.out.println("Enter a number;");
            num = Double.parseDouble(reader.nextLine());
            if(num>=(-30) && num<=40){
                Graph.addNumber(num);
            }
            days++;
        }
      
    }
}
