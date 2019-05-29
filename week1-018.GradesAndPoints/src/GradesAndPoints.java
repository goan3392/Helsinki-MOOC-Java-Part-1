
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int num = Integer.parseInt(reader.nextLine());
        /*
Points	Grade
0–29	failed
30–34	1
35–39	2
40–44	3
45–49	4
50–60	5
         */
        if(num<=29){
            System.out.print("Grade: failed");
        } else if(num<=34) {
            System.out.print("Grade: 1");
        }else if(num<=39) {
            System.out.print("Grade: 2");
        }else if(num<=44) {
            System.out.print("Grade: 3");
        }else if(num<=49) {
            System.out.print("Grade: 4");
        }else{
            System.out.print("Grade: 5");
        }    

    }
}
