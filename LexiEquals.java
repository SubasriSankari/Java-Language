import java.util.Scanner;

public class LexiEquals{
    public static void main(String args[])
    {
        System.out.println("Enter the First String:");
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        str1 = sc.nextLine();

        System.out.println("Enter the Second String:");
        String str2 = new String();
        str2 = sc.nextLine();
        
        if(str1.equals(str2))
            System.out.println("Both Strings are lexicographically Same.");
        else
            System.out.println("Both Strings are not equal");
    }
}