import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    
    public Library(){
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        books.add(newBook);
    }
    

    public void printBooks(){
        for(int i = 0; i< books.size(); i++){
            System.out.println(books.get(i));
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(int i = 0; i<books.size(); i++){
            Book titleSearched = this.books.get(i);
            String actualName = titleSearched.title();
            if(StringUtils.included(actualName,title)){
                found.add(titleSearched);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(int i = 0; i<books.size();i++){
            Book titleSearched = books.get(i);
            String publisherName = titleSearched.publisher();
            if(publisherName.contains(publisher)){
                found.add(titleSearched);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(int i = 0; i<books.size(); i++){
            Book actual = books.get(i);
            int yearPublished = actual.year();
            if(yearPublished == year){
                found.add(actual);
            }
        }
        return found;
    }
    
}
