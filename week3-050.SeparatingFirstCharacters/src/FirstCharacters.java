import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int length = name.length(), number = 1, character = 0;;
        if(name.length()>=3){
            while(true){
                System.out.println(number + ". character: " + name.charAt(character));
                if(number == 3)break;
                character++;
                number++;
                
        }          
            
        }
    }
}
