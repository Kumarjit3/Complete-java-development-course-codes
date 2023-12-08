import Inheritance1.*;

public class DInheritance1 
{
    public static void main(String[] args) 
    {
        Calculator c1 = new Calculator();
        AdvanceCalculator a1 = new AdvanceCalculator();
        VeryAdvanceCalculator v1 = new VeryAdvanceCalculator();


        int result1 = c1.Add(2,3);
        int result2 = c1.Sub(5,3);
        System.err.println("\n\nAddition Result Is : "+result1);
        System.err.println("\nSubtraction Result Is : "+result2);
        System.err.println("\n");


        int result3 = a1.Add(6,9);
        int result4 = a1.Sub(8,4);
        int result5 = a1.Mul(3,3);
        int result6 = a1.Div(9,6);
        System.err.println("\nAddition Result Is : "+result3);
        System.err.println("\nSubtraction Result Is : "+result4);
        System.err.println("\nMultiplication Result Is : "+result5);
        System.err.println("\nDivision Result Is : "+result6);
        System.err.println("\n");

        
        int result7 = v1.Add(5,9);
        int result8 = v1.Sub(2,4);
        int result9 = v1.Mul(7,3);
        int result10 = v1.Div(2,6);
        int result11 = v1.power(2,4);
        System.err.println("\nAddition Result Is : "+result7);
        System.err.println("\nSubtraction Result Is : "+result8);
        System.err.println("\nMultiplication Result Is : "+result9);
        System.err.println("\nDivision Result Is : "+result10);
        System.err.println("\nPower Of Result Is : "+result11);
        System.err.println("\n\n\n");
        
    }
}
