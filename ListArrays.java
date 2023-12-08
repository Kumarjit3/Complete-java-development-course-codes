import java.util.Arrays;
import java.util.List;

public class ListArrays 
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(3,1,5,2,4,7,6,9,8);
        System.out.print("\n");

        //Way Number 1
        for(int i=0; i<nums.size(); i++)
        {
            System.out.print("\n"+nums.get(i));
        }
        System.out.print("\n");

        //Way Number 2
        for(int n : nums)
        {
            System.out.print("\n"+n);
        }
        System.out.print("\n");

        //Way Number 3
        nums.forEach(n -> System.out.print("\n"+n));

        System.out.print("\n\n");
    }
}
