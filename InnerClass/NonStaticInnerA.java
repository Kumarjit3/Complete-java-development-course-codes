package InnerClass;

public class NonStaticInnerA
{
    private int num1;
    private int num2;

    public NonStaticInnerA()
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

    public class NonStaticInnerB
    {
        private int num3;

        public NonStaticInnerB()
        {
            num1=1;
            num2=1;
            num3=1;
        }

        public void sum()
        {
            System.out.print("\nSum Is : "+(num1+num2+num3)+"\n");
        }

        public void showB()
        {
            System.out.print("\nNum1 : "+num1+" Num2 : "+num2+" Num3 : "+num3+"\n\n\n");
        }

    }
}

