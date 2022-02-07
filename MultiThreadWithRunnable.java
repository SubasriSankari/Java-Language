import java.lang.*;

public class MultiThreadWithRunnable
{
    public static void main(String args[])
    {
        Thread thread1 = new Thread(new ThreadChild("Thread1 : "));
        Thread thread2 = new Thread(new ThreadChild("Thread2 : "));

        thread1.start();
        thread2.start();

        boolean thread1IsAlive = true;
        boolean thread2IsAlive = true;
        
        do {

            if(thread1IsAlive && !thread1.isAlive()){
                    thread1IsAlive = false;
                    System.out.println("Thread 1 is dead.");
            }

            if(thread2IsAlive && !thread2.isAlive()){
                    thread2IsAlive = false;
                    System.out.println("Thread 2 is dead.");
            }
        } while(thread1IsAlive || thread2IsAlive);
    }
}

class ThreadChild implements Runnable
{
    String name;
    public ThreadChild(String id)
    {
        name = id;
    } 

    public void run()
    {
        for(int ind = 0 ; ind < 5 ; ++ ind) 
        {
           randomWait();
           System.out.println(name + ind);
        }
    } 

    void randomWait()
    {
        try {
           Thread.sleep(500);
        }
        catch(InterruptedException x) {
           System.out.println("Interrupted!");
        }
    }
}