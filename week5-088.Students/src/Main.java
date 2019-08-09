
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if(name.equals(""))break;
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            Student newStudent = new Student(name, studentNumber);
            students.add(newStudent);
        }
        
        for(Student student: students){
            System.out.println(student);
        }
        System.out.print("Give search term here: ");
        String term = reader.nextLine();
        System.out.println("result: ");
        for(int i = 0; i< students.size(); i++){
            Student searchName = students.get(i);
            String s = searchName.getName();
            if(s.contains(term)){
                System.out.println(students.get(i));
            }
        }

    }
}
  