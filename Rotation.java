import java.util.HashMap;
import java.util.Scanner;

public class Rotation{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First String:");
        String str1 = new String();
        str1 = sc.nextLine();

        System.out.println("Enter the Second String:");
        String str2 = new String();
        str2 = sc.nextLine();

        if((str1 + str1).contains(str2) && str1.length() == str2.length())
        {
            System.out.println("2nd String is exist in First string rotation");
        }
        else
        {
            System.out.println("No its not exist");
        }   
    }
}