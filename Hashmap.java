package map;

import java.util.*;

public class Hashmap{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"suba");
        map.put(2,"sri");
        map.put(3,"sanakri");

        //Set set = map.entrySet();
        //Iterator iter = set.iterator();

        for(Map.Entry entry:map.entrySet())
        {
            System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
        }
    }
}