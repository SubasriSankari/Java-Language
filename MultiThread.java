
class CreateThread extends Thread
{
    String name;
    Thread thread;

    CreateThread(String str)
    {
        name = str;
        thread = new Thread(this, str);
        System.out.println("New thread : " + thread);
        thread.start();
    }
    public void run()
    {
        try
        {
            for(int ind = 3 ; ind > 0 ; ind--)
            {
                System.out.println(name + ":" + ind );
                Thread.sleep (500) ;
            }
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
        System.out.println(name + " exiting...");
    }
}
public class MultiThread
{
    public static void main(String args[])
    {
        CreateThread multiThread1 =new CreateThread("First");
        CreateThread multiThread2 = new CreateThread ("Second");

        System.out.println("Thread multiThread1 is alive :" + multiThread1.thread.isAlive());
        System.out.println("Thread multiThread2 is alive:" + multiThread2.thread.isAlive());

        try {
            System.out.println ("Waiting for thread to finish ...");
            multiThread1.thread.join();
            multiThread2.thread.join();
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
        System.out.println("Thread multiThread1 is alive : " + multiThread1.thread.isAlive());
        System.out.println("Thread multiThread2 is alive : " + multiThread2.thread.isAlive());
        System.out.println("Main thread exiting ... ");
    }
}