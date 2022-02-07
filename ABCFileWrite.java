import java.io.*;
import java.util.*;

public class ABCFileWrite
{
    public static void main(String args[ ] )
    {
        File wr = new File( "c:\\java\\abc.txt") ;
        System.out.println("File name is : " + wr.getName());
        System.out.println("File path is : " + wr.getPath());
        System.out.println("File Absolute path : " + wr.getAbsolutePath());
        System.out.println( wr.exists() ? "Success... File exists" : "Sorry... File does not exists");
        System.out.println( wr.isDirectory() ? "File is a directory" : "File is not a directory");
        System.out.println( wr.isFile() ? "File is an ordinary file" : "File may be a named pipe");

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the file name to set rename:");
        String str = sc.nextLine();
        File wr2 = new File(str);
        wr.renameTo(wr2);
        System.out.println("Renamed Successfully!!");
        wr.delete();
        System.out.println("Deleted Successfully!!");
    }
}