import java.util.*;

public class TargetValue{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] array = new int[size];
        for(int ind = 0 ; ind < size ; ind ++)
        {
            array[ind] = sc.nextInt();
        }
        System.out.println("Enter the Target Element:");
        int target = sc.nextInt();
        for(int ind = 0 ; ind < size ; ind ++)
        {
            for(int ind1 = ind + 1 ; ind1 < size ; ind1 ++)
            {
                if((array[ind] + array[ind1]) == target )
                {
                    System.out.println("Target Found");
                    System.exit(0);
                }
            }
        }
        System.out.println("Target Element not found");
        System.exit(1);
    }
}