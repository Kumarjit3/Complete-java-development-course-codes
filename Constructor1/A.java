package Constructor1;

public class A 
{
    private int x;
    private int y;

    public A(int x,int y) //Parameterized Constructor
    {
       this.x=x;
       this.y=y;
    }

    public A() //Default Or Zero Argument Constructor
    {
       x=0;
       y=0;
    }

    public void SetA(int x,int y) //setr
    {
       this.x=x;
       this.y=y;
    } 

   public int GetX() //getr
   {
      return x;
   }

   public int GetY() //getr
   {
       return y;
   }

   public void ShowA()
   {
       System.out.println("\nX : "+x+"\nY : "+y+"\n");
   }
}
