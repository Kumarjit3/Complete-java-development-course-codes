import java.util.Scanner;

public class Array 
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int Size;
       System.out.print("\nEnter The Array Size : ");
       Size = input.nextInt();
       int Array[] = new int[Size];

       System.out.print("\nEnter The "+Size+" Array Elements : \n");
       for(int i=0; i<Size; i++)
       {
          System.out.print("\nArray["+i+"] :- ");
          Array[i] = input.nextInt();
       }

       System.out.print("\nThe "+Size+" Array Elements Are : \n");
       for(int i=0; i<Size; i++)
       {
          System.out.print(Array[i]+" ");
       }

       System.out.print("\n\n\n");
       input.close();
    }
}
