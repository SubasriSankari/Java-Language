import java.util.*;

public class Leaders{

    void printLeader(int[] array, int size)
    {
        System.out.println("The Leaders are : ");
        int maxElement = array[size-1];
        System.out.println(maxElement);
        
        for(int ind = size - 2 ; ind >= 0 ; ind -- )
        {
            if(maxElement < array[ind])
            {
                maxElement = array[ind];
                System.out.println(maxElement);
            }
        }
    }

    public static void main(String args[])
    {
        Leaders obj = new Leaders();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] array = new int[size];
        for(int ind = 0 ; ind < size ; ind ++)
        {
            array[ind] = sc.nextInt();
        }
        obj.printLeader(array, size);
    }
}