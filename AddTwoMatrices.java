import java.util.*;

public class AddTwoMatrices{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int array1[][] = { { 1 , 2 , 3 } , { 4 , 5 , 6 } , { 7 , 8 , 9 } };
        int array2[][] = { { 1 , 2 , 3 } , { 4 , 5 , 6 } , { 7 , 8 , 9 } };
        
        int sum[][] = new int[3][3];

        System.out.println("The Array Sum is ");

        for(int ind = 0 ; ind < 3 ; ind ++)
        {
            for(int ind1 = 0 ; ind1 < 3 ; ind1 ++)
            {
                sum[ind][ind1] = array1[ind][ind1] + array2[ind][ind1];
                System.out.println(sum[ind][ind1]);
            }
        }
    }
}