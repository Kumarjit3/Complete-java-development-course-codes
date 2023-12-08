class A implements Runnable
{
   public void run()
   {
      for(int i=0; i<=5; i++)
      {
         System.out.print("\nHi There......");

         try{
            Thread.sleep(5);
         } catch(InterruptedException e) { e.printStackTrace(); }
      }
   }
}

class B implements Runnable
{
    public void run()
    {
        for(int i=0; i<=5; i++)
      {
         System.out.print("\nHello There......");
         
         try{
            Thread.sleep(5);
         } catch(InterruptedException e) { e.printStackTrace(); }
      }
    }
}


public class MultipleThreadBasic3 
{
    public static void main(String[] args)
    {
        Runnable a1 = new A();
        Runnable b1 = new B();

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);

        t1.start();
        t2.start();
    }
}
