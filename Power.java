import java.util.*;

public class Power{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value:");
        int base = sc.nextInt();
        System.out.println("Enter exponent value:");
        int exponent = sc.nextInt();
        int temp = exponent;
        int result = 1;
        while(temp != 0)
        {
            result *= base;
            temp --;
        }
        System.out.println("The power " + base + " of " + exponent + " is " + result);
    }
}