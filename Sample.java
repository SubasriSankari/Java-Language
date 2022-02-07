import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;
import java.util.*;

class summa{
  int var;

};

class summa2 extends summa{
  int var;
};

public class Sample {



	public static HashMap<String, Integer> copyMap(HashMap<String, Integer> original)
	{

		HashMap<String, Integer> second_map = new HashMap<>();

		// using putAll method to copy from original Map to
		// second_map
    second_map.put("d",4);
		second_map.putAll(original);

		return second_map;
	}

	public static void main(String[] args)
	{

		summa obj = new summa();
    summa obj2 = new summa2();
    summa2 obj3 = new summa();
	}



       // HashMap<String,Vector> cart = new HashMap<>();
        //Vector<Integer> vector = new Vector<Integer>(2);

        //System.out.println(vector.get(0));
        /*vector.add(30);
        vector.add(45);

        cart.put("7810045325", vector);
        cart.put("8248690919", vector);

        ObjectOutputStream outputStream = null;
        outputStream = new ObjectOutputStream(new FileOutputStream("yourFile.dat",true));
        outputStream.writeObject(cart);
        outputStream.close();

        ObjectInputStream inputStream = null;
        inputStream = new ObjectInputStream(new FileInputStream("yourFile.dat"));
        HashMap<String, Vector> res = (HashMap) inputStream.readObject();
        Set set = res.entrySet();
        Iterator iterator = set.iterator();
    
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
    
            System.out.print("key : " + entry.getKey() + " & Value : ");
            System.out.println(entry.getValue());
        }
        inputStream.close();*/

}