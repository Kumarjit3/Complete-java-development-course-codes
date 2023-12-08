import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMap 
{
     public static void main(String[] args) 
     {
        System.out.println("\n");
        List<Integer> nums = Arrays.asList(3,8,2,6,5,4);
        nums.forEach(n -> System.out.println(n));
        System.out.println("\n");
   

        Stream<Integer> s1 = nums.stream(); //now s1 have all the values of nums
        s1.forEach(n -> System.out.println(n));
        System.out.println("\n");

       //older way 
       Function<Integer,Integer> f1 = new Function<>() 
       {
           public Integer apply(Integer i)
           {
               return (i*2);
           }
       };
       Stream<Integer> s2 = nums.stream(); //now s2 have all the values of nums
       s2.map(f1).forEach(n -> System.out.print("\n "+n));
       System.out.println("\n");



       //new way
       Function<Integer,Integer> f2 = i ->  (i*2); 
       Stream<Integer> s3 = nums.stream();  //now s3 have all the values of nums
       s3.map(f2).forEach(n -> System.out.print("\n "+n));
       System.out.println("\n");



       //very new way
       Stream<Integer> s4 = nums.stream(); //now s4 have all the values of nums
       s4.map(i -> (i*2)).forEach(n -> System.out.print("\n "+n));


       System.out.println("\n\n");
     } 
}
