package array;

import java.util.*;

public class ArrayListClass{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        System.out.println("Enter the array Elements");
        for(int ind = 0 ; ind < 5 ; ind ++)
        {
            array.add(sc.nextLine());
        }

        System.out.println("Before remove");
        for(int ind = 0 ; ind < array.size() ; ind++)
        {
            System.out.println("Value " + array.get(ind));
        }

        array.remove(2);

        System.out.println("After remove");
        for(int ind = 0 ; ind < array.size() ; ind++)
        {
            System.out.println("Value " + array.get(ind));
        }

        Collections.sort(array);

        System.out.println("After sorting Ascending order");
        for(int ind = 0 ; ind < array.size() ; ind++)
        {
            System.out.println("Value " + array.get(ind));
        }

        Collections.reverse(array);

        System.out.println("After sorting Descending order");
        for(int ind = 0 ; ind < array.size() ; ind++)
        {
            System.out.println("Value " + array.get(ind));
        }

        StringBuilder str = new StringBuilder("");
        for(String val:array)
        {
            str.append(val).append(",");
        }

        System.out.println("The String Format is " + str.toString());
    }
}