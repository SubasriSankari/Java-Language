import java.util.*;

public class GuessRandom{

    public static int random()
    {
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        return result;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randomKey = random();
        boolean result = false;

        while(!result)
        {
            System.out.print("Enter the key:");
            int enter = sc.nextInt();
            if(enter > randomKey)
            {
                System.out.println("Too high, try again.");
            }
            else if(enter < randomKey)
            {
                System.out.println("Too low, try again.");
            }
            else
            {
                System.out.println("Yes.. You got it:)");
                result = true;
            }
        }
    }
}