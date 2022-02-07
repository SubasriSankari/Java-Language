import java.io.*;
import java.util.*;

public class MakeDirectory
{
    public static void main(String args[ ] )
    {
        File wr = new File( "abc.txt") ;
        
        boolean result = wr.mkdirs();
        if(result)
            System.out.println("New Directory is created!!");
        else
            System.out.println("Directory is not created!!");
        
        wr.close();
    }
}