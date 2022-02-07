import java.io.*;
import java.util.*;

public class ArrayOutOfBoundException{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 elements");
        int array[] = new int[5];
        for(int ind = 0 ; ind < 5 ; ind ++)
        {
            array[ind] = sc.nextInt();
        }
        System.out.println("The Elements are ");
        for(int ind = 0 ; ind <= 5 ; ind ++)
        {
            System.out.println(array[ind]);
        }
    }
}