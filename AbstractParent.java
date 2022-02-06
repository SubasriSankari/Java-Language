
abstract class Parent{
    abstract void message();
}

class A extends Parent{
    void message(){
        System.out.println("This is First Subclass");
    }
}

class B extends Parent{
    void message(){
        System.out.println("This is Second Subclass");
    }
}

public class AbstractParent{
    public static void main(String args[])
    {
        Parent obj;
        obj = new A();
        obj.message();
        obj = new B();
        obj.message();

    }
}