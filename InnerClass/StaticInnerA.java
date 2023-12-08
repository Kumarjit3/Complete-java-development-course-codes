package InnerClass;

//there is some problems on object creation of this class

public class StaticInnerA
{
    private int num1;
    private int num2;

    public StaticInnerA()
    {
        num1=3;
        num2=3;
    }

    public void setA(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }

    public void showA()
    {
       System.out.print("\nNum1 : "+num1+" Num2 : "+num2+"\n\n\n");
    }

    static class StaticInnerB 
    {

        //we can not use non static variables and methods of OuterClass in a static Innerclass 
        private int num3;

        public StaticInnerB()
        {
            num3=2;
        }

        public void showB()
        {
           System.out.print("\nNum3 : "+num3+"\n\n\n");
        }
    }
}
