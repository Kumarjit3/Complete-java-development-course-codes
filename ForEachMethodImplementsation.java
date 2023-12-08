import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodImplementsation 
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(3,7,2,5,1,6,4);

        //Consumer interface is a functional interface thats why we can use lamda expression here
        Consumer<Integer> con = new Consumer<>() 
        {
            public void accept(Integer n)
            {
               System.out.print("\n "+n);
            }
        };

        nums.forEach(con);
        System.out.print("\n\n");
    }
}
