import java.util.*;

class SwapTwoNumbers{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number :\n");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number :\n");
        int num2 = sc.nextInt();    
        System.out.println("Before Swapping of two numbers: Num1 " + num1 + " Num2 " + num2);  
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping of two numbers: Num1 " + num1 + " Num2 " + num2);

    }
}