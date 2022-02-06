import java.util.Scanner;

public class GetCharacterGivenIndex{
    public static void main(String args[])
    {
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        System.out.println("Enter the Index value to get Character:");
        int index = sc.nextInt();
        System.out.println("The Given Character is " + str.charAt(index));
    }
}