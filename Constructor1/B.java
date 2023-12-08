package Constructor1;

public class B extends A
{
     private int xx;
     private int yy;

     public B() //Default Or Zero Argument Constructor
     {
        xx=0;
        yy=0;
     }

     public B(int xx,int yy) //Parameterized Constructor
     {
        this.xx=xx;
        this.yy=yy;
     }

     public void SetB(int xx,int yy) //setr
     {
        this.xx=xx;
        this.yy=yy;
     } 

    public int GetXX() //getr
    {
       return xx;
    }

    public int GetYY() //getr
    {
        return yy;
    }

    public void ShowB()
    {
        System.err.println("\nXX : "+xx+"\nYY : "+yy+"\n");
    }
}
