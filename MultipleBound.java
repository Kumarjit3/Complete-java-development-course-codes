
class Bound<T extends A & B>
{
     private T obj;

    public Bound(T obj)
    {
       this.obj = obj;
    }

    public void run()
    {
      this.obj.execute();
    } 
}    

interface B
{
    public void execute();
}

class A implements B
{
    public void execute()
    {
        System.out.print("\nExecuting B class method\n");
    }
}

public class MultipleBound 
{
    public static void main(String[] args) 
    {
        Bound<A> a1= new Bound<>(new A());
        a1.run();
    }
}
