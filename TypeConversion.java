public class TypeConversion 
{
    public static void main(String[] args) 
    {
        int I = 577;
        byte b = 123;
        long L = 3452l;
        float F = 2.34f;
        char C = 'c';
        double D = 123.333;
        boolean B = true;

        System.err.print("\nInt = "+I+"\n");
        System.err.print("\nFloat = "+F+"\n");
        System.err.print("\nChar = "+C+"\n");
        System.err.print("\nLomg = "+L+"\n");
        System.err.print("\nDouble = "+D+"\n");
        System.err.print("\nBoolean = "+B+"\n");
        System.err.print("\nByte = "+b+"\n");

     /* b = I; //Error
        b = L; //Error
        b = F; //Error 
        b = C; //Error 
        b = D; //Error 
        b = B; //Error 
        B = D; //Error
        C = b; //Error
        B = b; //Error */ 

        I = b; //Execute
        L = b; //Execute
        D = b; //Execute
        F = C; //Execute
        I = C; //Execute
        D = L; //Execute

        System.err.print("\nInt = "+I+"\n");
        System.err.print("\nFloat = "+F+"\n");
        System.err.print("\nChar = "+C+"\n");
        System.err.print("\nLomg = "+L+"\n");
        System.err.print("\nDouble = "+D+"\n");
        System.err.print("\nBoolean = "+B+"\n");
        System.err.print("\nByte = "+b+"\n");


    }
}
