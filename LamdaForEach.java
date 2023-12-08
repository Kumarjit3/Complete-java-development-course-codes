import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaForEach 
{
    public static void main(String[] args) 
    {
        System.out.print("\n\n");
        List<Integer> nums = Arrays.asList(3,7,2,5,1,6,4);

        //old way
        Consumer<Integer> con = new Consumer<>() 
        {
            public void accept(Integer n)
            {
                System.out.print("\n "+n);
            }
        };
         nums.forEach(con);
         System.out.print("\n\n");

        //new way
        //Consumer interface is a functional interface thats why we can use lamda expression here
        Consumer<Integer> con1 = n -> System.out.print("\n "+n);
        nums.forEach(con1);
        System.out.print("\n\n");

        //very new way
        nums.forEach(n -> System.out.print("\n "+n));
        System.out.print("\n\n");


        System.out.print("\n\n");
    }
}
