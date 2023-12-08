abstract class Car
{
     abstract public void Drive();

     public void MusicPlayer()
     {
        System.out.print("\nMusic Is Now Playing\n");
     }
}

class Nexa extends Car
{
   public void Drive()
   {
      System.out.print("\nDriving\n");
   }
}

public class AbstractKeyword
{
    public static void main(String[] args) 
    {
        Nexa n1 = new Nexa();
        n1.Drive();
        n1.MusicPlayer();
    }
}
