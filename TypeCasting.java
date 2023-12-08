public class TypeCasting 
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

        //Here We Solve All The Errors By Using Type Casting

        b = (byte)I; //Solve
        b = (byte)L; //Solve
        b = (byte)F; //Solve 
        b = (byte)C; //Solve 
        b = (byte)D; //Solve 
       // b = (byte)B; //Error Casting Not Possible 
        I = (int)L; //Solve
       // B = (boolean)D; //Error Casting Not Possible
        C = (char)b; //Solve
       // B = (boolean)b; //Error Casting Not Possible

        System.err.print("\nInt = "+I+"\n");
        System.err.print("\nFloat = "+F+"\n");
        System.err.print("\nChar = "+C+"\n");
        System.err.print("\nLomg = "+L+"\n");
        System.err.print("\nDouble = "+D+"\n");
        System.err.print("\nBoolean = "+B+"\n");
        System.err.print("\nByte = "+b+"\n");
    }
}
