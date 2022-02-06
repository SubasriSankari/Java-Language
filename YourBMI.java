package my_pack;

import java.util.Scanner;

import my_pack.*;

public class YourBMI{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Weight in kg");
        float weight = sc.nextFloat();

        System.out.println("Enter the Height in cm");
        float height = sc.nextFloat();
        
        InputForBMI input = new InputForBMI();
        input.setData(height, weight);

        float bmi = input.getBMI();
        
        GetBMI print = new GetBMI();
        print.setBMI(bmi);
        print.getBMI();
    } 
}