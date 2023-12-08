import InnerClass.*;

public class DNonStaticInner 
{
    public static void main(String[] args) 
    {
        NonStaticInnerA obj = new NonStaticInnerA();
        NonStaticInnerA.NonStaticInnerB obj1 = obj.new NonStaticInnerB();
        obj1.showB();
        obj.showA();
    }
}
