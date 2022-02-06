import java.util.*;

public class QuadraticEquation{
    public static double discriminant(double a, double b, double c)
    {
        double result = (b * b) - (4.0 * a * c) ;
        return result;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();

        double value = discriminant(a, b, c);

        double x1;
        double x2;
        
        if(value > 0)
        {
            x1 = (-b + Math.pow(value , 0.5)) / ( 2.0 * a);
            x2 = (-b - Math.pow(value , 0.5)) / ( 2.0 * a);
            System.out.println("The Roots are x1:" + x1 + " x2:" + x2 );
        } 
        else if(value == 0.0)
        {
            x1 = x2 = -b / (2 * a);
            System.out.println("The Roots are equal " + x1);
        }
        else
        {
            System.out.println("The Roots are not equal.");
        }

        System.out.println();        
    }
}