import java.util.Scanner;

public class JaggedArray 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int Array[][] = new int[3][];

        Array[0] = new int[4];
        Array[1] = new int[3];
        Array[2] = new int[2];
     
        System.out.print("\n\nEnter The Array Elements : \n");

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<Array[i].length; j++)
            {
                System.out.print("\nArray["+i+"]["+j+"] :- ");
                Array[i][j] = input.nextInt();
            }
        }

         System.out.print("\n\nThe Array Elements Are: \n\n");
        for(int X[]:Array)
        {
            for(int Y:X)
            {
                System.out.print(Y+" ");
            }
            System.out.print("\n");
        }

        System.out.print("\n\n\n");
        input.close();
    }
}
