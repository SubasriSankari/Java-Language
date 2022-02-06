class Summing{
    final void sum(int num1, int num2)
    {
        System.out.println("The Sum of two numbers is " + num1 + num2);
    }
    void sum(int num1, int num2, int num3)
    {
        System.out.println("The Sum of three numbers is " + num1 + num2 + num3);
    }
}

public class PreventOverloading{
    public static void main(String args[])
    {
        Summing obj = new Summing();
        obj.sum(3, 4, 5);
    }
}