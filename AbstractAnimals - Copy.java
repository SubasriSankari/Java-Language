
abstract class Animals{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals{
    void cats(){
        System.out.println("Cats meow");
    }
    void dogs(){

    }
}

class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs bark");
    }
    void cats(){

    }
}

public class AbstractAnimals{
    public static void main(String args[])
    {
        Animals obj;
        obj = new Cats();
        obj.cats();
        obj = new Dogs();
        obj.dogs();
    }
}