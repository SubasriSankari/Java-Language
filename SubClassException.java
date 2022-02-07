import java.io.*;
import java.util.*;

class SuperClass{
    void method() throws IOException{
        System.out.println("This is from parent class");
    }
}

public class SubClassException extends SuperClass{
    public static void main(String args[])
    {
        SuperClass obj = new SuperClass();
        try{
            obj.method();
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
    }
}