
class Parent{
    final void func(){
        System.out.println("This is from Parent");
    }
}

class Child extends Parent{
    void func(){
        System.out.println("This is from Child");
    }
}

public class PreventOverriding{
    public static void main(String args[])
    {
        Parent obj = new Child();
        obj.func();
    }
}