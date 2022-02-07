import java.io.*;
import java.util.*;

public class FileReadWrite{
    public static void main(String args[]) throws IOException
    {
        FileWriter wr = new FileWriter("write.txt");
        String str = "Hello Welcome to File Handling";

        for(int ind = 0 ; ind < str.length() ; ind ++)
        {
            wr.write(str.charAt(ind));
        }

        System.out.println("Write Successfully!!");
        wr.close();

        int ch;
        FileReader rd = new FileReader("write.txt");
        while( ( ch = rd.read() ) != -1){
            System.out.print((char)ch);
        }
        rd.close();
    }
}