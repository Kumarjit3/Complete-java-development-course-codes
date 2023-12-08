import Multilevel.*;
import java.util.ArrayList;
import java.util.Scanner;


public class DFibonacci
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        
         System.out.print("\nEnter any positive integer :- ");
         int num = sc.nextInt();

         GetFibonacci g1 = new GetFibonacci();
         ArrayList<Integer> arr = g1.getFibonacci(num);
         
         System.out.print("\n");
         for(int a : arr)
         {
            System.out.print(" "+a+" ");
         }
         
        System.out.print("\n\n\n"); 
        sc.close();
    }
}