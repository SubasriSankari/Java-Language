package foodOrder;

import java.io.*;
import java.util.*;
import java.util.regex.*;

class Item implements Serializable{
    private String food;
    private int count;
    private int cost;

    void setItem(String food, int cost, int count)
    {
        this.food = food;
        this.cost = cost;
        this.count = count;
    }

    String getFood(){
        return food;
    }

    int getCount(){
        return count;
    }

    int getCost(){
        return cost;
    }
};

class OrderList extends Item{
    HashMap<String,Vector<Item>> cart = new HashMap<>();
};

public class FoodOrderApp { 

    private static final Scanner sc = new Scanner(System.in);
    private static String mobile;
    private static Vector<Item> vector = new Vector<Item>();
    private OrderList cartList = new OrderList();
    private Item item = new Item();

    void removeOneItem(){
        System.out.print("Enter the dish name want to remove:\n");
        sc.nextLine();
        String food = sc.nextLine();
        ObjectInputStream inputStream = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream("myCart.dat"));
            cartList.cart = (HashMap<String,Vector<Item>>) inputStream.readObject();          
            inputStream.close();
        }
        catch(IOException e){ }

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(cartList.cart.containsKey(mobile))
        {
            for(int ind = 0 ; ind < cartList.cart.get(mobile).size() ; ind ++ ){
                Item item = cartList.cart.get(mobile).get(ind);

                if((item.getFood()).equalsIgnoreCase(food)){
                    cartList.cart.get(mobile).remove(item);
                }
            }
            ObjectOutputStream outputStream = null;
            try{
                
                outputStream = new ObjectOutputStream(new FileOutputStream("myCart.dat"));
                outputStream.writeObject(cartList.cart);
                outputStream.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            System.out.println("Item removed Successfully...\n");
        }

    }

    void removeWholeItem(){

        ObjectInputStream inputStream = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream("myCart.dat"));
            cartList.cart = (HashMap<String,Vector<Item>>) inputStream.readObject();          
            inputStream.close();
        }
        catch(IOException e) {}

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Are you sure want to remove?(y/n)");
        char res = sc.next().charAt(0);
        
        if(res == 'y' || res == 'Y')
        {
            ObjectOutputStream outputStream = null;
            try{
                if(cartList.cart.containsKey(mobile))
                    cartList.cart.remove(mobile);
                
                outputStream = new ObjectOutputStream(new FileOutputStream("myCart.dat"));
                outputStream.writeObject(cartList.cart);
                outputStream.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            System.out.println("Item removed Successfully...\n");
        }
        else{
            System.out.println("Items are not removed Successfully...");
        }
    }

    void cancel(){
        System.out.println("\n1. To remove One Item ");
        System.out.println("2. To remove whole Item");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                removeOneItem();
                break;
            case 2:
                removeWholeItem();
                break;
            default:
                System.out.println("Wrong key entered...");
        }
    }

    void storeCart(){
        ObjectInputStream inputStream = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream("myCart.dat"));
            cartList.cart = (HashMap<String,Vector<Item>>) inputStream.readObject();        
            inputStream.close();
        }
        catch(IOException e){}

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void appendToList(){

        if(cartList.cart.get(mobile) != null)
            vector = cartList.cart.get(mobile);

        vector.add(item);
        cartList.cart.put(mobile,vector);   
        
        ObjectOutputStream outputStream = null;

        try{
            outputStream = new ObjectOutputStream(new FileOutputStream("myCart.dat"));
            outputStream.writeObject(cartList.cart);
            outputStream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    void AddToCart(String food, int perCost, int count){
        int totalCost = perCost * count;
        item.setItem(food, totalCost, count);

        storeCart();

        appendToList();
        System.out.println("Added To Cart Successfully...");       
        
    }

    private void restaurant(){
        System.out.println("\t\t\t ********************************");
        System.out.println("\t\t\t\t  Restaurant Items");
        System.out.println("\t\t\t ********************************");
        System.out.println("\t\t\t 1. Paneer Mushroom Masala  - 175");
        System.out.println("\t\t\t 2. Chilli Parota           - 120");
        System.out.println("\t\t\t 3. Schezwan Noodles        - 150");
        System.out.println("\t\t\t 4. Gobi Manjurian Dry      - 240");
        System.out.println("\t\t\t 5. Any Tiffen Item         - 80 ");
        System.out.println("\t\t\t ********************************");
        System.out.println("\nEnter Your Choice:");
        int choice = sc.nextInt();
        System.out.println("How Many Items you want?");
        int count = sc.nextInt();
        switch(choice)
        {

            case 1:
                AddToCart("Paneer Mushroom Masala", 175, count);
                break;

            case 2:
                AddToCart("Chilli Parota", 120, count);
                break;

            case 3:
                AddToCart("Schezwan Noodles", 150, count);
                break;

            case 4:
                AddToCart("Gobi Manjurian Dry", 240, count);
                break;

            case 5:
                AddToCart("Any Tiffen Item", 80, count);
                break;

            default:
                System.out.println("Error typing...");

        }
    }

    private void meat(){
        System.out.println("\t\t\t *************************************");
        System.out.println("\t\t\t\t    Meat & Sea Food ");
        System.out.println("\t\t\t *************************************");
        System.out.println("\t\t\t 1. Chicken Pepper Soup         - 60  ");
        System.out.println("\t\t\t 2. Chicken 65                  - 150 ");
        System.out.println("\t\t\t 3. Roasted Chicken Honey sauce - 400 ");
        System.out.println("\t\t\t 4. Fish Chettinad              - 264 ");
        System.out.println("\t\t\t 5. Fish Tikka Masala           - 336 ");
        System.out.println("\t\t\t 6. Chicken Biriyani            - 216 ");
        System.out.println("\t\t\t *************************************");

        System.out.println("\nEnter Your Choice:");
        int choice = sc.nextInt();
        System.out.println("How Many Items you want?");
        int count = sc.nextInt();
        switch(choice)
        {
            case 1:
                AddToCart("Chicken Pepper Soup", 60, count);
                break;

            case 2:
                AddToCart("Chicken 65", 150, count);
                break;

            case 3:
                AddToCart("Roasted Chicken Honey sauce", 400, count);
                break;

            case 4:
                AddToCart("Fish Chettinad", 264, count);
                break;

            case 5:
                AddToCart("Fish Tikka Masala", 336, count);
                break;

            case 6:
                AddToCart("Chicken Biriyani", 216, count);
                break;

            default:
                System.out.println("Error typing...");

        }
    }

    private void healthyHub(){
        System.out.println("\t\t\t *************************************");
        System.out.println("\t\t\t\t    Healthy Hub ");
        System.out.println("\t\t\t *************************************");
        System.out.println("\t\t\t 1. Apple and Fig               - 195");
        System.out.println("\t\t\t 2. Peanut Butter Smoothie Bowl - 125");
        System.out.println("\t\t\t 3. Mixed Fruit Juice           - 155");
        System.out.println("\t\t\t 4. Fruit salad                 - 80 ");
        System.out.println("\t\t\t 5. Dragon Fruit Smoothie Bowl  - 130");
        System.out.println("\t\t\t 6. Watermelon salad            - 95 ");
        System.out.println("\t\t\t *************************************");

        System.out.println("\nEnter Your Choice:");
        int choice = sc.nextInt();
        System.out.println("How Many Items you want?");
        int count = sc.nextInt();
        switch(choice)
        {
            case 1:
                AddToCart("Apple and Fig", 195, count);
                break;

            case 2:
                AddToCart("Peanut Butter Smoothie Bowl", 125, count);
                break;

            case 3:
                AddToCart("Mixed Fruit Juice", 155, count);
                break;

            case 4:
                AddToCart("Fruit salad", 80, count);
                break;

            case 5:
                AddToCart("Dragon Fruit Smoothie Bowl", 130, count);
                break;

            case 6:
                AddToCart("Watermelon salad", 95, count);
                break;

            default:
                System.out.println("Error typing...");

        }
    }

    double showCart(){

        ObjectInputStream inputStream = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream("myCart.dat"));
            cartList.cart = (HashMap<String,Vector<Item>>) inputStream.readObject();          
            inputStream.close();
        }
        catch(IOException e){}

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        int count_item = 1;
        double total_Amount = 0;

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("  %-10s %-20s %30s %10s(in Rs.)\n","Count","Item"," No of Item","Cost");
        System.out.println("----------------------------------------------------------------------------------------------------");

        if(cartList.cart.containsKey(mobile))
        {         
            for(int ind = 0 ; ind < cartList.cart.get(mobile).size() ; ind ++)
            {
                Item item = cartList.cart.get(mobile).get(ind);
                String food = item.getFood();
                System.out.printf(" %5d.  %-38s %10d-Item  %10d\n",count_item, food, item.getCount(), item.getCost());
                total_Amount += (int)item.getCost();
                count_item ++;
            }
        }
        if(total_Amount == 0.0){
            System.out.println("No Item is found in Cart");
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        return total_Amount;
    }

    void cart(){
        System.out.println("\nYour Cart Items are :");
        double amount = showCart();
        System.out.println("\n   Your Total Amount is " + amount);
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    void separateList(){
        for(String key: cartList.cart.keySet())
        {
            if(key.equals(mobile)){

                OrderList delivered = new OrderList();
                ObjectInputStream inputStream = null;
                try{
                    inputStream = new ObjectInputStream(new FileInputStream("DeliveredList.dat"));
                    delivered.cart = (HashMap<String,Vector<Item>>) inputStream.readObject();          
                    inputStream.close();
                }
                catch(IOException e){}

                catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

                Vector<Item> deliver_vector = new Vector<Item>();
                for(int ind = 0 ; ind < cartList.cart.get(mobile).size() ; ind ++)
                {
                    Item item = cartList.cart.get(mobile).get(ind);
                    deliver_vector.add(item);
                }

                delivered.cart.put(mobile, deliver_vector);

                ObjectOutputStream outputStream = null;

                try{
                    outputStream = new ObjectOutputStream(new FileOutputStream("DeliveredList.dat"));
                    outputStream.writeObject(delivered.cart);
                    outputStream.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        ObjectOutputStream outputStream = null;

        try{
            if(cartList.cart.containsKey(mobile))
                cartList.cart.remove(mobile);
            outputStream = new ObjectOutputStream(new FileOutputStream("myCart.dat"));
            outputStream.writeObject(cartList.cart);
            outputStream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    void pay(){
        System.out.println("Your Orders are:\n");

        double amount = showCart();

        System.out.println("\n  Your Total Amount is " + amount);
        System.out.println("----------------------------------------------------------------------------------------------------");
        if(amount!= 0.0){
            System.out.println("\nEnter the Online Payment to buy the Food:");
            double money = sc.nextDouble();
            if(money == amount){
                separateList();
                System.out.println("Thanks for Buying:)");
            }
            else{
                System.out.println("Your Payment not sent Successfully.... Try again Later");
            }
        }   
    }

    void mainMenu(){

        while(true)
        {
            System.out.println("\n\t\t  ~~~~~~~~~~~~~~~~~  WELCOME TO FASTFOOD APP ~~~~~~~~~~~~~~~~\n\n");
            System.out.println("\t\t\t\t ************************************");
            System.out.println("\t\t\t\t\t\tHOME PAGE");
            System.out.println("\t\t\t\t ************************************");
            System.out.println("\t\t\t\t   1. Restaurant");
            System.out.println("\t\t\t\t   2. Meat ");
            System.out.println("\t\t\t\t   3. Healthy Hub ");
            System.out.println("\t\t\t\t   4. See Cart ");
            System.out.println("\t\t\t\t   5. Pay ");
            System.out.println("\t\t\t\t   6. Remove Item from the Cart ");
            System.out.println("\t\t\t\t   7. Exit ");
            System.out.println("\t\t\t\t ************************************");

            System.out.println("\nEnter your choice:");
            int choice;
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    restaurant();
                    break;

                case 2:
                    meat();
                    break;

                case 3:
                    healthyHub();
                    break;

                case 4:
                    cart();
                    break;

                case 5:
                    pay();
                    break;

                case 6:
                    cancel();
                    break;    

                case 7:
                    System.out.println("\nSignout Successfully... Thanks for Using our App:)\n");
                    System.exit(0);

                default:
                    System.out.println("Entered wrong key... try one more time");
                
            }
        }        
    }

	public static void main(String args[])
    {       
        System.out.println("Sign in with Mobile Number:");
        mobile = sc.nextLine();
        Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = pattern.matcher(mobile);
        if(match.matches()){
            new FoodOrderApp().mainMenu();
        }
        else{
            System.out.println("Invalid Mobile Number...");
        }
    }
}