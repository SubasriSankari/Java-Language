import java.util.*;

class MultiplicationTable{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print table:\n");
        int num = sc.nextInt();      
        for(int ind = 1 ; ind < 11 ; ind ++)
        {
            System.out.println(ind + " * " + num + " = " + ind * num);
        }
    }
}