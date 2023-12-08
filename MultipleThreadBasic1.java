class A extends Thread
{
     public void run()
     {
        for(int i=0; i<200; i++)
        {
            System.out.print("\nHi There.....");
        }
     }
}

class B extends Thread
{
     public void run()
     {
        for(int i=0; i<200; i++)
        {
            System.out.print("\nHello There.....");
        }
     }
}



public class MultipleThreadBasic1 
{
    public static void main(String[] ars)
    {
       A a1 = new A();
       B b1 = new B();

       a1.start();
       b1.start();

       System.out.print("\n\n\n");       
    }
}
