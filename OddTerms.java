import java.util.*;

public class OddTerms{
    public static int findSum(int term)
    {
        int sum = 0;
        int value = 1;
        for(int ind = value ; ind <= term ; ind ++)
        {
            sum += value;
            value += 2;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number term:");
        int num = sc.nextInt();

        System.out.println("The Sum of Odd terms upto " + num + " is " + findSum(num));        
    }
}