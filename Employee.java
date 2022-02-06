import java.util.*;

public class Employee{

    String name;
    int yearOfJoining;
    int salary;
    String address;
    
    Employee(String name, int yearOfJoining, int salary, String address)
    {
        this.address = address;
        this.name = name;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }
    
    public static void main(String[] args) {

        Employee person1 = new Employee("Robert", 1994, 2000, "64C- WallsStreat");
        Employee person2 = new Employee("Sam", 2000, 3500, "68D- WallsStreat");
        Employee person3 = new Employee("John", 1999, 9200, "26B- WallsStreat");
        
        System.out.println("Name " + person1.name + ", Year of Joining "+ person1.yearOfJoining + ", salary " + person1.salary + ", Address " + person1.address);
        System.out.println("Name " + person2.name + ", Year of Joining "+ person2.yearOfJoining + ", salary " + person2.salary + ", Address " + person2.address);
        System.out.println("Name " + person3.name + ", Year of Joining "+ person3.yearOfJoining + ", salary " + person3.salary + ", Address " + person3.address);
               
    }
}