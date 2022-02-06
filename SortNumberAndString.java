import java.util.*;

public class SortNumberAndString{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int intArray[] = {12, 9, 6, 34, 101, 53, 1};
        String strArray[] = {"dabc" , "bcda" , "jhgi" , "abcd"};

        System.out.println("Before Sorting " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("After Sorting " + Arrays.toString(intArray));

        System.out.println("Before Sorting " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("After Sorting " + Arrays.toString(strArray));
        
    }
}