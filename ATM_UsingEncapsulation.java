import java.util.*;

class NewUser{
    private int pin;
    public int amount;
    int getPin(){
        return pin;
    }
    void setPin(int pin)
    {
        this.pin = pin;
    }
}

public class ATM_UsingEncapsulation{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Banking\n");
        NewUser obj = new NewUser();
        System.out.println("Please insert your atm card!!");
        System.out.println("Enter your new 4 digit secret pin...");
        int pin = sc.nextInt();        
        obj.setPin(pin);
        System.out.println("Your pin set Successfully");
        System.out.println("Enter your Debit amount..");
        obj.amount = sc.nextInt();
        System.out.println("Thanks for using our ATM\n\n");
        System.out.println("Your Secret Pin is " + obj.getPin() + ". Available balance is " + obj.amount + "..");
    }
}