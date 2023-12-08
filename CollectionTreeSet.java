import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTreeSet 
{
    public static void main(String[] args) 
    {
        Collection<Integer> c1 = new TreeSet<Integer>();

        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);

        Iterator<Integer> i1 = c1.iterator();

        System.out.print("\n");
        while(i1.hasNext())
        {
            System.out.print(" "+i1.next()+" ");
        }
        System.out.print("\n\n\n");
    }
}
