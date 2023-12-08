import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayList 
{
    public static void main(String[] args)
    {
        Collection<Integer> c1 = new ArrayList<Integer>();

       c1.add(9);
       c1.add(6);
       c1.add(3);
       c1.add(1);
       c1.remove(9);

       System.out.print("\n"+c1+"\n");

        for(int x : c1)
       {
          System.out.print(+x+" ");
       }
    }
}
