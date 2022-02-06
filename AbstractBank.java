
abstract class Bank{
    abstract void getBalance();
}

class BankA extends Bank{
    void getBalance(){
        System.out.println("Bank C has $100");
    }
}

class BankB extends Bank{
    void getBalance(){
        System.out.println("Bank C has $150");
    }
}

class BankC extends Bank{
    void getBalance(){
        System.out.println("Bank C has $200");
    }
}

public class AbstractBank{
    public static void main(String args[])
    {
        Bank obj;
        obj = new BankA();
        obj.getBalance();
        obj = new BankB();
        obj.getBalance();
        obj = new BankC();
        obj.getBalance();

    }
}