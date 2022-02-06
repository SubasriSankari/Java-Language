package vector;

import java.util.*;

public class VectorClass{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("Data added to vector Succesfully");

        vector.remove(2);

        for(int ind = 0 ; ind < vector.size() ; ind++)
        {
            System.out.println("Value " + vector.get(ind));
        }
    }
}