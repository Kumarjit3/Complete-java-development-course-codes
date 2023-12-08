import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort 
{
    public static void main(String[] args) 
    {
        List<Integer> number = new ArrayList<>();

        number.add(60);
        number.add(50);
        number.add(40);
        number.add(30);
        number.add(20);
        number.add(10);

        Collections.sort(number); //We use Collections class predefine function sort(objectName) for sorting here;

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
