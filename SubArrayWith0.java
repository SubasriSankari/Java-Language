import java.util.*;

public class SubArrayWith0{

    static boolean ExistOrNot(int[] array, int size)
    {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        int sum = 0;      
        for (int ind = 0; ind < size; ind ++) 
        {  
            sum += array[ind]; 
            if (array[ind] == 0 || sum == 0 || hash.get(sum) != null)                          
                return true; 
              
            hash.put(sum, ind); 
        }  
        return false; 
    }
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
        if(ExistOrNot(array, size))
            System.out.println("true");
        else
            System.out.println("false");
        
    }
}