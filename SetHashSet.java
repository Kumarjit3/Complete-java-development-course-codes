import java.util.HashSet;
import java.util.Set;

public class SetHashSet 
{
    public static void main(String[] args)
    {
        Set<Integer> s1 = new HashSet<Integer>();

        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(10);  //we can not store duplicate values here

        System.out.print("\nSize : "+s1.size());

         System.out.print("\n");
        for(int x: s1)
        {
             System.out.print(" "+x+" ");
        }

        s1.remove(0);
    }
}
