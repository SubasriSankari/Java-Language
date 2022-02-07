import java.io.*;
import java.util.*;  

public class MultipleExceptionCatch{
    public static void main(String args[])
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to check divisible");
            int size = Integer.parseInt(sc.nextLine());
            if(99 % size == 0) 
                System.out.println("This is right factor");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Arithmetic " + ex);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Number Format Exception " + ex);
        }
    }
}