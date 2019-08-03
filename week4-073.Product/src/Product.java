
public class Product {
    private String name;
    private double price;
    private int startAmount;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.startAmount = amountAtStart;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price +" amount " + this.startAmount);
    }
    
}
