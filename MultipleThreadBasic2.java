
class A extends Thread
{
    public void run()
    {
        for(int i=0; i<100; i++)
        {
            System.out.print("\nHi There......");

            try{
               Thread.sleep(10);
              } catch (InterruptedException e) { e.printStackTrace();  }
        }
    }
}


class B extends Thread
{
    public void run()
    {
        for(int i=0; i<100; i++)
        {
            System.out.print("\nHello There......");

            try{
                Thread.sleep(10);
            } catch(InterruptedException e) { e.printStackTrace(); }
        }
    }
}


public class MultipleThreadBasic2
{
    public static void main(String[] args)
    {
        A a1 = new A();
        B b1 = new B();

        a1.start();

        try{
            Thread.sleep(2);
           } catch(InterruptedException e) { e.printStackTrace(); }

        b1.start();

        System.out.print("\n\n\n");
    }
}