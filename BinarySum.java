import java.util.*;

public class BinarySum{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String binary1;
        System.out.print("Enter the First Binary number : ");
        binary1 = sc.next();

        String binary2;
        System.out.print("Enter the Second Binary number : ");
        binary2 = sc.next();

        Integer integer1 = Integer.parseInt(binary1, 2);
        Integer integer2 = Integer.parseInt(binary2, 2);

        Integer output = integer1 + integer2;
  
        System.out.println("\nSumming of two binary numbers is " + Integer.toBinaryString(output));

    }
}