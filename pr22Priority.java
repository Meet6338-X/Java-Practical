class MyRunnable implements Runnable 
{
    @Override
    public void run() 
    {
        System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
    }
}
public class pr22Priority
{
    public static void main(String[] args) {
        // Create three threads
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");
        // Set priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY);   // Min priority = 1
        thread2.setPriority(Thread.NORM_PRIORITY);  // Normal priority = 5
        thread3.setPriority(Thread.MAX_PRIORITY);   // Max priority = 10
        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        // Change priority of thread2
        thread2.setPriority(Thread.MAX_PRIORITY);
    }
}
