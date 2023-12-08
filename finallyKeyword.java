import java.util.Scanner;

public class finallyKeyword 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int result=0;

        System.out.print("\nEnter an integer : ");
        int num = sc.nextInt();

        //try block
        try 
        {
           result = num/i;
        }

        catch(ArithmeticException e)   //Here i catch arithmetic exception
        {
            System.out.print("\nDivided by zero exception "+e+"\n");
        }

        finally
        {
            System.out.print("\nThe result is : "+result+"\n"); //Here i printing the result
            sc.close(); //Here i closing connection
        }

    }
}
