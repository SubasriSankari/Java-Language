import java.io.*;
import java.util.*;

public class UpperCase
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to change uppercase:");
        String str = sc.nextLine();
        StringBuffer strBfr = new StringBuffer(str);

        for(int ind = 0 ; ind < str.length() ; ind ++)
        {
            strBfr.setCharAt(ind, Character.toUpperCase(str.charAt(ind)));
        }

        System.out.println("The new String is " + strBfr);
    }
}