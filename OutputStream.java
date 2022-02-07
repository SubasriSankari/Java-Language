import java.io.*;
import java.util.*;

public class OutputStream
{
    public static void main(String args[]) throws IOException
    {
        FileOutputStream wr = new FileOutputStream("OutputStream.txt") ;
        
        String str = "Hello Welcome to File OutputStream!!";
        byte b[] = str.getBytes();
        wr.write(b);
        
        wr.close();
    }
}