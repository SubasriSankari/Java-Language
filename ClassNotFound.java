import java.io.*;
import java.util.*;

public class ClassNotFound{
    public static void main(String args[])
    {
        try{
            Class.forName("hello");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }
}