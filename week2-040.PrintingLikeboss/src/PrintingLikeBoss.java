public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int count = 0;
        while(amount>count){
            System.out.print("*");
            count++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int count = 0;
        while(amount>count){
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int star = 1;
        while(size>0){
            printWhitespaces(size-1);
            printStars(star);
            size--;
            star++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int count = 0, star=1,heightd = height;
        while(height>count){
            printWhitespaces(heightd-1);
            printStars(star);
            heightd--;
            star+=2;
            count++;
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
