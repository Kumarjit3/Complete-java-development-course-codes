package DynamicMethodDispatch;

class person
{
    public void Show()
    {
        System.out.print("\nHello From Person\n");
    }
}

class employee extends person
{
    public void Show()
    {
        System.out.print("\nHello From Employee\n");
    }
}

public class DMD 
{
    public static void main(String[] args) 
    {
        person p1 = new person();
        p1.Show();

        p1 = new employee();
        p1.Show();

    }
}
