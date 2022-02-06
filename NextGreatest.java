import java.util.*;

public class NextGreatest{

    static int[] FindNext(int[] array, int size)
    {
        int maxElement =  array[size-1];
        array[size-1] = -1;
 
        for (int ind = size-2 ; ind >= 0; ind--)
        {
            int temp = array[ind];
            array[ind] = maxElement;
            if(maxElement < temp)
            maxElement = temp;
        }
		return array;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] array = new int[size];
        int result[];
        for(int ind = 0 ; ind < size ; ind ++)
        {
            array[ind] = sc.nextInt();
        }
        result = FindNext(array, size);
        System.out.println("The Rearranged array is " + Arrays.toString(result));
        
    }
}