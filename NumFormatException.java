import java.io.*;
import java.util.*;

public class NumFormatException{
    public static void main(String args[])
    {
        String name = "subasri";
        try{
            int value = Integer.parseInt(name);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}