import java.util.*;

public class AddDigits{
    public static int digits (int number)
    {
        int result = 0;
        while(number > 0)
        {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 0 to 1000 :");
        int num = sc.nextInt();
        if(num > 0 && num < 1000 )
        {

            System.out.println("Addition of all digits is " + digits(num) ); 
        }
        else
        {
            System.out.println("Error... Invalid number entered");
        }
               
    }
}