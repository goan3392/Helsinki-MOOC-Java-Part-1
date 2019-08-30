import java.util.Random;
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int count;
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.count = 0;
    }
    
    public NightSky(int width, int height){
        this.width = width;
        this.height = height;
        this.density = 0.1;
        this.count = 0;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        this.count = 0;
    }
    
    public void printLine(){
        for(int i = 0; i<this.width; i++){
            Random rand = new Random();
            double probability = rand.nextInt(10) + 1;
            if(probability<=this.density*10){
                System.out.print("*");
                this.count++;
            }else{
                System.out.print(" ");
            }
        }
    }
    
    public void print(){
        this.count = 0;
        for(int i = 0; i<this.height; i++){
            printLine();
            System.out.println();
        }
        
    }
    
    public int starsInLastPrint(){
        return this.count;
    }
}
