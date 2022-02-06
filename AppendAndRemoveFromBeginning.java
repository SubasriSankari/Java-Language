import java.util.HashMap;
import java.util.Scanner;

public class AppendAndRemoveFromBeginning{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First String:");
        String str1 = new String();
        str1 = sc.nextLine();

        System.out.println("Enter the Second String:");
        String str2 = new String();
        str2 = sc.nextLine();

        StringBuilder strbld1 = new StringBuilder(str1);
        StringBuilder strbld2 = new StringBuilder(str2);

        if(strbld1.length() != strbld2.length())
        {
            if(strbld1.length() > strbld2.length())
            {
                strbld1.delete(0,(strbld1.length() - strbld2.length()));
            }
            else
            {
                strbld2.delete(0,(strbld2.length() - strbld1.length()));
            }
        } 
        strbld1.append(strbld2);
        System.out.println("The new String is " + strbld1);       
    }
}