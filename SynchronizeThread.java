
class Counter
{
    int count;

    public synchronized void increment()
    {
        count++;
    } 
}


public class SynchronizeThread 
{
    public static void main(String[] args) throws InterruptedException 
    {
 
       Counter c1 = new Counter();

       Runnable a1 = new Runnable()
       {
          public void run()
          {  
           for(int i=0; i<10000; i++)
           {
              c1.increment();
           }
          }
       };

       Runnable a2 = new Runnable() 
       {
         public void run()
         {
           for(int i=0; i<10000; i++)
           {
               c1.increment();
           } 
         }
       };
       

       Thread t1 = new Thread(a1);
       Thread t2 = new Thread(a2);

       t1.start();
       t2.start();

       t1.join();
       t2.join();

       System.out.print("\n"+c1.count+"\n\n");

    }
}





/*
 * Runnable a1 = new Runnable()
       {
          public void run()
          {  
           for(int i=0; i<1000; i++)
           {
            c1.increment();
           }
          }
       };

       Runnable a2 = new Runnable() 
       {
         public void run()
         {
           for(int i=0; i<1000; i++)
           {
               c1.increment();
           } 
         }
       };
 */