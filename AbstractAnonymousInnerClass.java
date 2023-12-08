abstract class Car
{
     public abstract void Drive();

     public void MusicPlayer()
     {
        System.out.print("\nMusic Is Now Playing\n");
     }
}


public class AbstractAnonymousInnerClass 
{
    public static void main(String[] args) 
    {
       Car c1 = new Car() 
       {
          public void Drive()
          {
             System.out.print("\nDriving Start\n");
          }
       };

       c1.Drive();
    }
}
