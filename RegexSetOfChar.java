import java.util.*;
import java.util.regex.*;

public class RegexSetOfChar{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to check Regex Operation :");
        String str = sc.nextLine();

        boolean result = str.matches("^[a-zA-Z0-9]*$");
        System.out.println("\n 1.String " + str + " " + result + " to having only set of characters." );

        boolean result1 = str.matches("pq*?");
        System.out.println("\n 2.String " + str + " " + result1 + " to having a p followed by more q's.");

        boolean result2 = str.matches("^[a-z]+_[a-z]+$");
        System.out.println("\n 3.String " + str + " " + result2 + " lowercases with underscore.");

        boolean result3 = str.matches("p.*?q$");
        System.out.println("\n 4.String " + str + " " + result3 + " starting with p and ending with q.");

        Pattern pattern = Pattern.compile("\\Bg\\B");
        Matcher result4 = pattern.matcher(str);
        if(result4.find())
            System.out.println("\n 5.String " + str + " Found to having g but not in starting and ending.");

        boolean result5 = str.matches("^[a-zA-Z0-9_]*$");
        System.out.println("\n 6.String " + str + " " + result5 + " to having only lower, upper, numbers, underscore.");

        System.out.println("\n 7.String " + str.replaceAll("(?<=^|\\.)0+(?!\\.|$)","") + " all zeroes are eliminated.");

        String dupStr = str.toLowerCase();
        if(dupStr.contains("python"))
        {
            System.out.println("\n 8.New String is Java");
        }
        else
        {
            System.out.println("\n 8.New String is C++");
        }

        System.out.println("\n 9.String " + str.replaceAll("(?i)[aeiou]",""));

        if(str.contains("."))
        {
            System.out.println("\n 10.The Decimal value length is " + str.replaceAll(".*\\.(?=\\d?)","").length());
        }

        boolean result6 = str.matches("\\d{4}|\\d{6}|\\d{8}");
        System.out.println("\n 11.String " + str + " " + result6 + " -> pin having size 4 , 6 or 8 .");

    }
}