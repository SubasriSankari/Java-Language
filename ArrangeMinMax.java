import java.util.*;

public class ArrangeMinMax{

    static int[] Arrange(int[] array, int size)
    {
        int result[] = new int[size];
        int small = 0, large = size-1;
        boolean flag = true;
        for (int ind = 0 ; ind < size ; ind ++)
        {
            if (flag)
                result[ind] = array[large--];
            else
                result[ind] = array[small++];
     
            flag = !flag;
        }
        return result;
    }

    public static void main(String args[])
    {
        ArrangeMinMax obj = new ArrangeMinMax();
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
        Arrays.sort(array);
        result = obj.Arrange(array, size);
        System.out.println("The Rearranged array is " + Arrays.toString(result));
    }
}