import java.util.HashMap;
import java.util.Scanner;

public class NequalParts{
    public static void main(String args[])
    {
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();

        int len = str.length();

        System.out.println("Enter the number of parts to split:");
        int n = sc.nextInt();

        int temp = 0, chars = len/n;  
        String[] splitStr = new String [n];  

        if(len % n != 0) {  
            System.out.println("Strings could not split to the given parts");  
        }  
        else {  

            for(int ind = 0; ind < len; ind = ind + chars) {  
                String part = str.substring(ind, ind + chars);  
                splitStr[temp] = part;  
                temp++;  
            }  
            System.out.println("The " + n + " equal parts are ");  
            for(int ind = 0; ind < splitStr.length ; ind ++) {  
                System.out.println(splitStr[ind]);  
                }  
            }  
    }
}