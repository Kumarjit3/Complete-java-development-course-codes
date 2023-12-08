import java.util.TreeSet;
import java.util.Set;

public class SetTreeSet 
{
    public static void main(String[] args)
    {
        Set<Integer> s1 = new TreeSet<Integer>();

        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(10);  
        System.out.print("\nSize : "+s1.size());

         System.out.print("\n");
        for(int x: s1)     //Here we get by default sorted values
        {
             System.out.print(" "+x+" ");
        }

        s1.remove(0);
    }
}
