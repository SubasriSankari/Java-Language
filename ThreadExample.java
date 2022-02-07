import java.io.*;
import java.util.*;

public class ThreadExample implements Runnable{

    public void run(){
        try{
            System.out.println("Before Sleep..");
            Thread.sleep(500);
            System.out.println("After Sleep..");
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        ThreadExample obj = new ThreadExample();
        Thread thread = new Thread(obj);
        thread.start();
    }
}