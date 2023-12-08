import java.util.Scanner;

public class Operators 
{
    public static void main(String a[])
    {
         Scanner sc = new Scanner(System.in);

         //Arithmetic Operatorss
         int n1 = 12;
         int n2 = 13;
         int Add = n1+n2;
         int Sub = n2-n1;
         int Mul = n1*n2;
         int Div = n1/n2;
         int Res1 = n1++;
         int Res2 = n2--;
         int Res3 = ++n1;
         int Res4 = --n2;

         System.err.print("\nAdd = "+Add+"\n");
         System.err.print("\nSub = "+Sub+"\n");
         System.err.print("\nMul = "+Mul+"\n");
         System.err.print("\nDiv = "+Div+"\n");
         System.err.print("\nRes1 = "+Res1+"\n");
         System.err.print("\nRes2 = "+Res2+"\n");
         System.err.print("\nRes3 = "+Res3+"\n");
         System.err.print("\nRes4 = "+Res4+"\n\n");
        
         //Assignment Operators
         int A = 10;
         int B = 20;
         System.err.print("\n\nBefore______________________________\n");
         System.err.print("\nA = "+Res4+"\n");
         System.err.print("\nB = "+Res4+"\n");
         A += 10;
         B -= 10;
         A *= 3;
         B /= 2;
         A %= 5;
         System.err.print("\nAfter______________________________\n");
         System.err.print("\nA = "+A+"\n");
         System.err.print("\nB = "+B+"\n\n");


         //Relational Operators
         int F = 12;
         int S = 10;
         boolean R1 = F==S; 
         boolean R2 = F!=S;
         boolean R3 = F>S;
         boolean R4 = F<S;
         boolean R5 = F>=S;
         boolean R6 = F<=S;

         System.err.print("\n\nR1 = "+R1+"\n");
         System.err.print("\nR2 = "+R2+"\n");
         System.err.print("\nR3 = "+R3+"\n");
         System.err.print("\nR4 = "+R4+"\n");
         System.err.print("\nR5 = "+R5+"\n");
         System.err.print("\nR6 = "+R6+"\n\n");

         //Logical Operators
         int K=3;
         int D=5;
         int R=7;
         boolean result1 = K>D && D>R;
         boolean result2 = K>D || D>R;
         boolean result3 = !(K>D || D>R);

         System.err.print("\n\nresult1 = "+result1+"\n");
         System.err.print("\nresult2 = "+result2+"\n");
         System.err.print("\nresult3 = "+result3+"\n\n");


         //Ternary Operators
         System.out.println("\nEnter Ram's Total Marks : ");
         int ram = sc.nextInt();
         System.out.println("Enter Rohim's Total Marks : ");
         int rohim = sc.nextInt();

         String result = ram > rohim ? "Ram Is The First" : "Rohim Is First";
         System.out.println(result);
         sc.close();
    }
}
