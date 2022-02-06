class Animals{
    void cats(){
        System.out.println("This cat is from Parent Class");
    }
}

class Cats extends Animals{
    void cats(){
        System.out.println("This cat is from Child Class");
    }
}

public class DynamicBinding{
    public static void main(String args[])
    {
        Animals obj = new Cats();
        obj.cats();
    }
}