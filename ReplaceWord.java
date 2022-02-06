import java.util.Scanner;

public class ReplaceWord{
    public static void main(String args[])
    {
        System.out.println("Enter the First String:");
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();

        System.out.println("Before Replace : " + str);
        str = str.replaceAll("fox", "cat");
        System.out.println("After Replace : " + str);
    }
}