
public class BoxingUnboxing 
{
    public static void main(String[] args)
    {
       int num = 3;
       char cum = 'a';

       Integer i1 = Integer.valueOf(num);         //Boxing
       Integer i2 = Integer.valueOf("33");      //Boxing
       Character c1 = Character.valueOf(cum);     //Boxing
       String s1 = new String("Hello");  //Boxing
 
       int num1 = i1;     //UnBoxing
       int num2 = i2;     //UnBoxing
       char cum1 = c1;    //UnBoxing
       String sum1 = s1;  //UnBoxing
       

       System.out.print("\nInteger1 : "+num1);     //Printing
       System.out.print("\nInteger2 : "+num2);     //Printing
       System.out.print("\nCharacter1 : "+cum1);   //Printing
       System.out.print("\nString1 : "+sum1);      //Printing
    }
}