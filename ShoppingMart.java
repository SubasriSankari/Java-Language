package shoppingMart;

import java.io.*;
import java.util.*;

class Item implements Serializable{
    private int count;
    private  double amount;
    private String item_name;

    void setData(String item_name, int count, double amount){
        this.item_name = item_name;
        this.amount = amount;
        this.count = count;
    }

    void setName(String item_name)
    {
        this.item_name = item_name;
    }

    String getItemName(){
        return item_name;
    }

    double getAmount(){
        return amount;
    }

    int getCount(){
        return count;
    }

}

class Data{
    static Item item = new Item();
    static Vector<Item> vector = new Vector<Item>();
}

abstract class StoreFile{
    void writeForUser(int count){
        read();
        //System.out.println("Before " + Data.vector.size());
        Data.vector.remove(count-1);
        //System.out.println("After " + Data.vector.size());
        ObjectOutputStream outputStream = null;
        try{
                
            outputStream = new ObjectOutputStream(new FileOutputStream("ShoppingMartStoreDetails.dat"));
            outputStream.writeObject(Data.vector);
            outputStream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    void writeForOwner(){
        read();
        Data.vector.add(Data.item);
        //System.out.println("Write For Owner " + Data.item);
        ObjectOutputStream outputStream = null;
        try{
                
            outputStream = new ObjectOutputStream(new FileOutputStream("ShoppingMartStoreDetails.dat"));
            outputStream.writeObject(Data.vector);
            outputStream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    void read(){
        ObjectInputStream inputStream = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream("ShoppingMartStoreDetails.dat"));
            Data.vector = (Vector<Item>) inputStream.readObject();          
            inputStream.close();
        }
        catch(IOException e){ }

        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        //System.out.println("Read " + Data.vector);
    }
}


class Stores extends StoreFile{
    
    void show(){

        read();
        int count = 1;
        System.out.println("---------------------------------------------------------------------");
        System.out.printf(" %10s    %-20s %-10s %10s\n","Serial num", "Item Name", "Count", "Total Cost");
        System.out.println("---------------------------------------------------------------------");
        for(int ind = 0 ; ind < Data.vector.size() ; ind ++)
        {
            System.out.printf(" %-10d   %-20s   %-10d %10f\n",count, Data.vector.get(ind).getItemName(), Data.vector.get(ind).getCount(),Data.vector.get(ind).getAmount());
            count++;
        }
        System.out.println("---------------------------------------------------------------------");
    }
}

class User extends StoreFile{
    private static Scanner sc = new Scanner(System.in); 
    User(){
        System.out.println("Enter Serial Number to get the product:\n");
        int count = sc.nextInt();
        writeForUser(count);
        System.out.println("Item get Successfully..");
    }
}

class Owner extends StoreFile{
    private static Scanner sc = new Scanner(System.in); 
    Owner(){
        System.out.println("Enter the product detail:\n");
        System.out.println("Enter the Product name:");
        String item_name = sc.nextLine();
        System.out.println("Enter the count of product:");
        int count = sc.nextInt();
        System.out.println("Enter the Cost of product:");
        double amount = sc.nextDouble();
        Data.item.setData(item_name, count, amount);
        //System.out.println("Before Write " + Data.item.getItemName() + Data.item.getCount() + Data.item.getAmount());
        writeForOwner();
        System.out.println("Item added Successfully..");
    }
}

public class ShoppingMart{

    private static Scanner sc = new Scanner(System.in); 
    
    static void mainMenu(){
        while(true)
        {
            System.out.println("\n1. User");
            System.out.println("2. Owner");
            System.out.println("3. Stores");
            System.out.println("4. Exit");
            System.out.println("\nEnter your Choice:");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    new User();
                    break;
                case 2:
                    new Owner();
                    break;
                case 3:
                    new Stores().show();
                    break;
                case 4:
                    System.out.println("Thanks for coming... See You again:)");
                    System.exit(0);
                default:
                    System.out.println("Error Invalid key entered..");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~Welcome to Super Market~~~~~~~~~~~~~~~~~~~~~~\n\n");
        mainMenu();
    }
}