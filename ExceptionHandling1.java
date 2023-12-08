public class ExceptionHandling1 
{
    public static void main(String[] args)
    {
        int i=6,n=15,result=0;
        int arr[] = new int[6];
        String str=null;

        System.out.println("Hello : \n");

        try            
        {
           result = n/i;    //Throwing Arithmetic exception from here
           System.out.println("\n"+result+"\n");

           System.out.println("\n"+arr[1]+"\n");
           System.out.println("\n"+arr[5]+"\n");  //Throwing ArrayOutOfBoundException exception from here


        
          System.out.println(str.length()); //Throing Null pointer Exception from here

        }
        catch(ArithmeticException e)  //Single catch 
        {
            System.out.println("\nDivided By Zero Exception : "+e+"\n");
        }
        catch(ArrayIndexOutOfBoundsException e) //Can Catch Single Exception
        {
            System.out.println("\nArray Out Of Bound Exception : "+e+"\n");
        }
        catch(Exception e) //Can Catch Multiple Exception
        {
             System.out.println("\nSomething Went Wrong : "+e+"\n");
        }

        System.out.println("Bye : \n");
    }
}
