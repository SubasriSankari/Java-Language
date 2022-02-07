import java.io.*;
import java.util.*;

public class UserInputFileReadWrite{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        FileWriter wr = new FileWriter("write.txt");
        System.out.println("Enter the String to write into file : ");
        String str = sc.nextLine();

        for(int ind = 0 ; ind < str.length() ; ind ++)
        {
            wr.write(str.charAt(ind));
        }

        System.out.println("Write Successfully!!");
        wr.close();

        int ch;
        FileReader rd = new FileReader("write.txt");
        System.out.println("\nReading from file : ");
        while( ( ch = rd.read() ) != -1){
            System.out.print((char)ch);
        }
        rd.close();
    }
}