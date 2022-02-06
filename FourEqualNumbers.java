import java.util.*;

class FourEqualNumbers{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third Number:");
        int num3 = sc.nextInt();
        System.out.print("Enter the Fourth Number:");
        int num4 = sc.nextInt();
        if(num1 == num2 && num2 == num3 && num3 == num4)
        {
            System.out.println("Equal..");
        }
        else
        {
            System.out.println("Not Equal..");
        }
    }
}