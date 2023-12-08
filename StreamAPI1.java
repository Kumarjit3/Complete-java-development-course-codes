import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI1 
{
    public static void main(String[] args)
    {
        System.out.println("\n");
        List<Integer> nums = Arrays.asList(3,8,1,9,5,4);
         nums.forEach(n -> System.out.println(n));
         System.out.println("\n");
   
        Stream<Integer> s1 = nums.stream(); //now s1 have all the values of nums

        System.out.println("\n "+s1);
        System.out.println("\n");

        //older way 
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (e,c) -> e+c);
        System.out.println("\nResult : "+result+"\n");

        //New way
        int res = nums.stream()
                    .filter(n -> n%2==0)
                    .map(n -> n*2)
                    .reduce(0,(ans,i) -> ans+i);
        System.out.println("\nResult : "+res+"\n");            

        System.out.println("\n\n");
    }
}
