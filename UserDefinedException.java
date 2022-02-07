import java.io.*;
import java.util.*;

class ErrorPinLocked extends Exception{
    public ErrorPinLocked(String str)
    {
        super(str);
    }
}

public class UserDefinedException extends SuperClass{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 digit pin");
        String atm_pin = sc.nextLine();
        try{
            if(atm_pin.length() == 4)
            {
                System.out.println("Correct pin... You can proceed now");
            }
            else
            {
                throw new ErrorPinLocked("Error pin... your has been locked");
            }
        }
        catch (ErrorPinLocked ex)
        {
            System.out.println("Caught an error");
            System.out.println(ex.getMessage());
        }
    }
}