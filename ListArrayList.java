import java.util.List;
import java.util.ArrayList;

public class ListArrayList 
{
    public static void main(String[] args)
    {
        List<Integer> l1 = new ArrayList<Integer>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.set(0,10);
        l1.set(1,20);

        System.out.print("\n"+l1.get(0)+" ");
        System.out.print("\n"+l1.get(3)+" \n");

        for(int x:l1)
        {
            System.out.print(x+" ");
        }

        l1.remove(0);
    }
}
