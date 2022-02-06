import java.util.*;

public class LargestNumber {
    static void printLargest(Vector<String> arr)
    {

        Collections.sort(arr, new Comparator<String>()
        {
            @Override public int compare(String X, String Y)
            {
                String XY = X + Y;
                String YX = Y + X;
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        Iterator it = arr.iterator();

        while (it.hasNext())
            System.out.print(it.next());
    }

    public static void main(String[] args)
    {

        Vector<String> array;
        array = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        
        for(int ind = 0 ; ind < size ; ind ++)
        {
            array.add(sc.next());
        }
        printLargest(array);
    }
}