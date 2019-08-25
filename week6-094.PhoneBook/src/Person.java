
public class Person {
    private String name;
    private String number;
    
    public Person(String namePerson, String numberPerson){
        this.name = namePerson;
        this.number = numberPerson;
    }
    
    public String getNumber(){
        return this.number;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void changeNumber(String newNum){
        this.number = newNum;
    }
    
    public String toString(){
        return getName() + " number: " + getNumber();
    }
        
}
