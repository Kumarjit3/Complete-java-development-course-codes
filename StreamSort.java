import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamSort 
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(3,4,1,2,5,4,6,8,7,9,10); 
        nums.forEach(n -> System.out.println(n));
        System.out.println("\n");

        Stream<Integer> s1 = nums.stream();
        s1.forEach(n -> System.out.println(n));
        System.out.println("\n");

        Stream<Integer> s2 = nums.stream()
                                        .filter(n -> n%2==0)
                                        .map(n -> n*3)
                                        .sorted();  //sorted method is performing sorting

        s2.forEach(n -> System.out.println(n));

        System.out.println("\n\n");
    }
}
