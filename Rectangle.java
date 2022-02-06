import java.util.*;

public class Rectangle{

    int length;
    int breadth;

    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    int Area(){
        return length * breadth;
    }
    
    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle(4,5);
        Rectangle obj2 = new Rectangle(5,8);
  
        System.out.println("Area of first Rectangle is " + obj1.Area());
        System.out.println("Area of first Rectangle is " + obj2.Area());
               
    }
}