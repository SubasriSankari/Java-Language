import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar{
    public static void main(String args[])
    {
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();

        int len = str.length();

        HashMap<Character,Integer> chCount = new HashMap<Character,Integer>();

        Character ch;
        for(int ind = 0 ; ind < len ; ind++)
        {
            ch = str.charAt(ind);
            if(chCount.containsKey(ch))
            {
                chCount.put(ch, chCount.get(ch) + 1);
            }
            else
            {
                chCount.put(ch, 1);
            }
        }
        for(int ind = 0 ; ind < len ; ind ++)
        {
            ch = str.charAt(ind);
            if(chCount.get(ch) == 1)
            {
                System.out.println("The First non-Repeating Character is : " + ch);
                break;
            }
        }
    }
}