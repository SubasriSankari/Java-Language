import java.io.*;

public class ThrowException{
    public static void main(String args[])
    {
        try{
            FileReader file = new FileReader("C:\\throw.txt");  
            BufferedReader fileInput = new BufferedReader(file);  
            throw new FileNotFoundException();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("See you");
    }
}