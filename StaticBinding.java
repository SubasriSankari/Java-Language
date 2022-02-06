
public class StaticBinding{
    void sound(){
        System.out.println("This is Cat");
    }
    public static void main(String args[])
    {
        StaticBinding obj = new StaticBinding();
        obj.sound();
    }
}