import java.util.HashMap;
import java.util.Scanner;

public class WildCardCharacters
{
    public static boolean isMatch(String word, int n, String pattern, int m)
    {
        if (m == pattern.length())
        {
            return n == word.length();
        }
        if (n == word.length())
        {
            for (int i = m; i < pattern.length(); i++)
            {
                if (pattern.charAt(i) != '*') {
                    return false;
                }
            }
 
            return true;
        }
        if (pattern.charAt(m) == '?' || pattern.charAt(m) == word.charAt(n))
        {
            return isMatch(word, n + 1, pattern, m + 1);
        }
        if (pattern.charAt(m) == '*')
        {
            return isMatch(word, n + 1, pattern, m) || isMatch(word, n, pattern, m + 1);
        }
        return false;
    }
    public static boolean isMatch(String word, String pattern) {
        return isMatch(word, 0, pattern, 0);
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First String:");
        String str1 = new String();
        str1 = sc.nextLine();

        System.out.println("Enter the Second String:");
        String str2 = new String();
        str2 = sc.nextLine();

        System.out.println(isMatch(str1,str2));
    }
}