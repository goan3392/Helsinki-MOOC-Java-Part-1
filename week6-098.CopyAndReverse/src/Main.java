

public class Main {

    public static void main(String[] args) {
        // write testcode here
    int[] original = {1, 2, 3, 4};
    int[] copied = copy(original);

    // change the copied
    copied[0] = 99;

    // print both
    System.out.println( "original: " + original);
    System.out.println( "copied: " + copied);
    }
    
    public static int[] copy(int[] array){
        int[] copied = new int[array.length];
        for(int i = 0; i<copied.length; i++){
            copied[i] = array[i]; 
        }
      
        return copied;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] reversed = new int[array.length];
        for(int i = 0; i < reversed.length; i++){
            reversed[i] = array[array.length-i-1];
        }
        return reversed;
    }
    
    
    
}
