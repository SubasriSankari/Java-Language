import java.util.*;

public class FloatingPoint{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floating point value:");
        float value = sc.nextFloat();
        if(value == 0.0)
        {
            System.out.println("Zero");
        }
        else if(value > 0.0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
        if(value > 1.0)
        {
            System.out.println("Large");
        }
        else
        {
            System.out.println("Small");
        }
    }
}