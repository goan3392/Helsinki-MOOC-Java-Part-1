import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> information;
    
    public Phonebook(){
        this.information = new ArrayList<Person>();
    
    }
    
    public void add(String nameOfPerson, String numberOfPerson){
        Person newPerson = new Person(nameOfPerson, numberOfPerson);
        information.add(newPerson);
    }
    
    public void printAll(){
        for(Person people: information){
            System.out.println(people);
        }
    }
    
    public String searchNumber(String name){
        for(int i = 0; i < information.size(); i++){
            Person searchPerson = information.get(i);
            String nameResult = searchPerson.getName();
            String numberResult = searchPerson.getNumber();
            if(nameResult.equals(name))return numberResult;
        }
        return "number not known";
    }
}
