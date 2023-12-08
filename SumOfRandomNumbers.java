import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumOfRandomNumbers
{
    public static void main(String[] args)
    {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for(int i=0; i<size; i++)
        {
            nums.add(ran.nextInt(100));
        }

         System.out.println("\n");
        /*for(int n : nums)
        {
            System.out.println(" "+n+" ");
        }*/

        /*int sum1 = nums.stream()
                       .map(i -> i*2)
                       .reduce(0, (c,e) -> c+e);*/


        long startSeq = System.currentTimeMillis();               
        int sum2 = nums.stream()
                       .map(i -> {
                    try{ Thread.sleep(1); }catch(Exception e) { }
                         return i*2;
                         })
                        .mapToInt(i -> i)
                        .sum();
        long endSeq = System.currentTimeMillis(); 


        long startpara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        .map(i -> {
                    try{ Thread.sleep(1); }catch(Exception e) { }
                         return i*2;
                         })
                        .mapToInt(i -> i)
                        .sum();
        long endPara = System.currentTimeMillis();                

        // System.out.println("\nSum Is : "+sum1+"\n");
         System.out.println("\nSum Is : "+sum2+"\n");
         System.out.println("\nTime taken by sum2 is : "+(endSeq-startSeq)+"\n");                     
         System.out.println("\nSum Is : "+sum3+"\n\n");
         System.out.println("\nTime taken by sum3 is : "+(endPara-startpara)+"\n\n");
    }
}