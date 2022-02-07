import java.util.*;

public class Student{

    String name;
    int id;
    
    public static void main(String[] args) {

        Student obj = new Student();
        obj.name = "John";
        obj.id = 2;
        
        System.out.println("Name " + obj.name + "\nID "+ obj.id);
               
    }
}