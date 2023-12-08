class A
{
    public void Show()
    {
        System.out.print("\nIn A Show\n");
    }
}


public class AnonymousInnerClass 
{
    public static void main(String[] args) 
    {
        A a1 = new A() //Anonymous Inner Class
        {
           public void Show()
           {
             System.out.print("\nIn New Show\n\n");
           }  
        };

        a1.Show();
    }
}
