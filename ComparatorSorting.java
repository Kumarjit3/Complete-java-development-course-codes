import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorting 
{
    public static void main(String[] args) 
    {

        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                   if(i%10 > j%10)
                   {
                      return 1;
                   }
                   else
                   {
                      return -1;
                   }
            }
        };

        List<Integer> number = new ArrayList<>();

        number.add(66);
        number.add(55);
        number.add(42);
        number.add(38);
        number.add(21);
        number.add(19);

        Collections.sort(number,com); //We use Collections class predefine function sort(objectName) for sorting here;

        System.out.print("\n");
        for(int x:number)
        {
            System.out.print(x+"\n");
        }

        System.out.print("\n\n");
        System.out.print(" "+number);
        System.out.print("\n\n\n");
    }
}
