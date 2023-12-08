class A
{
    public void showTheAllDetailsOfThisClass()
    {
        System.out.println("\nIn A Class Show\n");
    }
}

class B extends A
{
    @Override  //Annotation
    public void showTheAllDetailsOfThisClass()
    {
        System.out.println("\nIn B Class Show\n");
    }
}

public class AnnotationBasic 
{
    public static void main(String[] args)
    {
        A a1 = new B();
        a1.showTheAllDetailsOfThisClass();
    }
}
