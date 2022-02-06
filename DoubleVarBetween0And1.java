import java.util.*;

public class DoubleVarBetween0And1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Double Number:");
        Double num1 = sc.nextDouble();
        System.out.print("Enter the Second Double Number:");
        Double num2 = sc.nextDouble();
        
        if((num1 > 0 && num1 < 1) && (num2 > 0 && num2 < 1) )
        {
            System.out.println("Accepted..");
        }
        else
        {
            System.out.println("Not Accepted..");
        }
    }
}