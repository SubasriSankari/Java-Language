import java.io.*;
import java.util.*;

class ArraySizeNegativeException extends Exception  
{  
    public ArraySizeNegativeException(String str)  
    {    
        super(str);  
    }  
}  

public class ArraySizeException{
    public static void main(String args[])
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array size");
            int size = sc.nextInt();
            if(size<=0)  
                throw new ArraySizeNegativeException("Error size");
            else
                System.out.println("This is right size");
        }
        catch(ArraySizeNegativeException e)
        {
            System.out.println(e);
        }
    }
}