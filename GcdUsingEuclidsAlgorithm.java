import java.util.*;

public class GcdUsingEuclidsAlgorithm{

    public static int gcd(int first, int second) {
        if (second == 0) {
            return first;
        }
        return gcd(second , first % second);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number:");
        int num2 = sc.nextInt();

        System.out.println("GCD of two numbers is " + gcd( num1 , num2 ));        
    }
}