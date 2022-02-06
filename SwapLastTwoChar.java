import java.util.HashMap;
import java.util.Scanner;

public class SwapLastTwoChar{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str1 = new String();
        str1 = sc.nextLine();

        int length = str1.length();
        char ch[] = str1.toCharArray();
        char temp = ch[length - 1];
        ch[length - 1] = ch[length - 2];
        ch[length - 2] = temp;
        System.out.println(ch);
        
    }
}