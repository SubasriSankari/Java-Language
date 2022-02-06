package map;

import java.util.*;

public class StudentRanking{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("subasri",1);
        map.put("sri",2);
        map.put("sankari",3);

        //Set set = map.entrySet();
        //Iterator iter = set.iterator();

        for(Map.Entry entry:map.entrySet())
        {
            System.out.println("Name " + entry.getKey() + " - Rank " + entry.getValue() + ".");
        }
    }
}