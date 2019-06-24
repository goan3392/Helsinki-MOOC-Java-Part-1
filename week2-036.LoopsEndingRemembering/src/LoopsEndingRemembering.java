import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        int sum = 0, count = 0, even = 0, odd = 0;
        
        while(true){
            int number = Integer.parseInt(read.nextLine());
            if(number == -1) break;
            sum+=number;
            count++;
            if(number % 2 == 0){
                even++;
            }else{
                odd++;
            }
           
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + sum/(double)(count));
        System.out.println("Even numbers: " + even);
        System.out.println("odd numbers: " + odd);
        
    }
}
