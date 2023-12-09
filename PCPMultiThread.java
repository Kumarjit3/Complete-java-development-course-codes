
class Item
{
    static boolean item=false;
    final static int MaxItem = 5;
    static int p = 1;
    static int c = 1;
}

class Producer implements Runnable
{
     public synchronized void run()
     {
        while(Item.p <= Item.MaxItem)
        {
         if(Item.item == false)  //if you do not have any item
         {
            System.out.print("\nProducer Produced Item : "+Item.p++);
            Item.item = true;
         }
         else
         {
            try
            {
                System.out.print("\nProducer is Waiting Sometime for Consumer : \n");
              Thread.sleep(3);
            } catch(Exception e)
            {
                e.printStackTrace();
            }
         }
        }
     }
}

class Consumer implements Runnable
{
    
    public synchronized void run()
    {
        while(Item.c <= Item.MaxItem)
        {
         if(Item.item == true)  //if you do have any item
         {
            System.out.print("\nConsumer Consume Item : "+Item.c++);
            Item.item = false;
         }
         else
         {
            try
            {
                System.out.print("\nConsumer is Waiting Sometime for Producer : \n");
                Thread.sleep(3);
            } catch(Exception e)
            {
                e.printStackTrace();
            }
         }  
        } 
    }
}


public class PCPMultiThread 
{
    public static void main(String[] args) throws InterruptedException
    {
       Runnable p1 = new Producer();
       Runnable c1 = new Consumer();
       
       Thread t1 = new Thread(p1);
       Thread t2 = new Thread(c1);

       t1.start();
       t2.start();

       t1.join();
       t2.join();
 
       System.out.println("\n\n5 item is produced & consumed\n\n\n");
    }
}
