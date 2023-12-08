
@FunctionalInterface
interface A 
{
    void show();
}

@FunctionalInterface
interface B
{
    public void seen(int i);
}

@FunctionalInterface
interface C
{
    public void shine(int i,int j,int k);
}

public class FunctionalInterface1 
{
    public static void main(String[] args) 
    {
        //Old Way to make Annonymous Inner classs

        A a1 = new A() 
        {
            public void show()
            {
                System.out.print("\nHello its A Show\n");
            }
        };
        a1.show();


        //New Way to make Annonymous Inner classs

        //it is included in java-8 version
        A a2 = () -> System.out.print("Hello Its A Show\n");
        a2.show();



        //Old Way to make Annonymous Inner classs

        B a3 = new B() 
        {
            public void seen(int i)
            {
                System.out.print("\nHello its B Seen : "+i+"\n");
            }
        };
        a3.seen(3);


         //New Way to make Annonymous inner class

        //we can also pass values as argument like -
        //for one argument no need to use first braket
        B a4 = i -> System.out.print("\nHello its B Seen : "+i+"\n");
        a4.seen(12);


        //Old Way to make Annonymous Inner classs

        C c1 = new C() 
          {
             public void shine(int i,int j,int k)
             {
                System.out.print("\nHello its C Shine : "+i+" , "+j+" , "+k+" \n");
             }
          };
          c1.shine(3,6,9);

          //New Way to make Annonymous inner class

         //we can also pass values as argument like -
        //for two or more argument need to use first braket

         C c2 = (i,j,k) -> System.out.print("\nHello its C Shine : "+i+" , "+j+" , "+k+" \n");
          c2.shine(3,6,9);

        System.out.print("\n\n");
    }
}
