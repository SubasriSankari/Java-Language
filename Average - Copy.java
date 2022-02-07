import java.util.*;

public class Average{

    int num1;
    int num2;
    int num3;

    Average(int num1, int num2, int num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    int average()
    {
        return (num1 + num2 + num3)/3;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number:");
        int num3 = sc.nextInt();
        Average obj = new Average(num1, num2, num3);
        System.out.println("The Average of three numbers is " + obj.average());
               
    }
}