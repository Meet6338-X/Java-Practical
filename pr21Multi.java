class ThreadA extends Thread 
{
    private boolean suspended = false;

    public void run() 
    {
        synchronized (this) 
        {
            System.out.println("ThreadA started.");
            try 
            {
                while (suspended) 
                {
                    wait();
                }
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
            System.out.println("ThreadA resumed.");
        }
    }

    public void resumeThread() 
    {
        suspended = false;

        synchronized(this) 
        {
            notify();
        }
    }
}

class ThreadB extends Thread 
{
    public void run() 
    {
        synchronized (this) 
        {
            System.out.println("ThreadB started.");
            try 
            {
                wait();
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
            System.out.println("ThreadB resumed.");
        }
    }
}

public class pr21Multi
{
    public static void main(String[] args) 
    {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        
        threadA.start();
        threadB.start();

        try
        {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        threadA.resumeThread();
        try 
        {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        synchronized (threadB) 
        {
            threadB.notify();
        }
    }
}