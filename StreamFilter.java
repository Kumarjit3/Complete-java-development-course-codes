import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilter 
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
       Predicate<Integer> p1 = new Predicate<>() 
       {
           public boolean test(Integer i)
           {
               return (i%2==0);
           }
       };
       Stream<Integer> s2 = nums.stream(); //now s2 have all the values of nums
       s2.filter(p1).forEach(n -> System.out.print("\n "+n));
       System.out.println("\n");



       //new way
       Predicate<Integer> p2 = i ->  (i%2==0); 
       Stream<Integer> s3 = nums.stream();  //now s3 have all the values of nums
       s3.filter(p2).forEach(n -> System.out.print("\n "+n));
       System.out.println("\n");



       //very new way
       Stream<Integer> s4 = nums.stream(); //now s4 have all the values of nums
       s4.filter(i -> (i%2==0)).forEach(n -> System.out.print("\n "+n));


       System.out.println("\n\n");
   }    
}
