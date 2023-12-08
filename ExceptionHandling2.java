public class ExceptionHandling2 
{
    public static void main(String[] args)
    {
        int n=13,i=0,result=0;

        try{
        if(i==0)
        {
            throw new ArithmeticException("\nDivided By Zero Exception\n");
        }
           result = n/i;
    }
        catch(ArithmeticException e)
        {
             System.out.print("\n"+result+e+"\n");
        }

    }
}
