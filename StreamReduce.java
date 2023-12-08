import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamReduce 
{
    public static void main(String[] args) 
    {
         System.out.println("\n");

         List<Integer> nums = Arrays.asList(3,2,9,7,4,8);
         nums.forEach(n -> System.out.println(n));
         System.out.println("\n");

         Stream<Integer> s1 = nums.stream(); // now s1 have all the values of nums
         s1.forEach(n -> System.out.println(n));
         System.out.println("\n");

         Stream<Integer> s2 = nums.stream(); // now s1 have all the values of nums
         int result = s2.reduce(0,(c,e) -> c+e);
         System.out.println("\nResult : "+result);

         System.out.println("\n\n");
    } 
}
