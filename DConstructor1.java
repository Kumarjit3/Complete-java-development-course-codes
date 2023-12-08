import Constructor1.*;

public class DConstructor1 
{
   public static void main(String[] args) 
   {
       A a1 = new A();
       B b1 = new B(6,6); //calling B class parameterized constructor
       
       b1.ShowB();
       a1.showA();

       System.err.println("\n\n\n");
   }   
}
