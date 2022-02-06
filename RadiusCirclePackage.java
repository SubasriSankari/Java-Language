package p2;

import p1.*;
import java.util.*;

public class RadiusCirclePackage{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        CirclePackage obj = new CirclePackage();
        System.out.println("Enter the radius of circle:");
        double radius = sc.nextDouble();
        obj.setRadius(radius);
        System.out.println("The Area of the Circle is " + obj.Area());
    }
}