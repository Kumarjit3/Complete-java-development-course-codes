package Multilevel;
import java.util.ArrayList;


public class GetFibonacci
{
public ArrayList<Integer> getFibonacci(int num)
{
     int i=0,a=-1,b=1,c=0;
     ArrayList<Integer> arr = new ArrayList<Integer>();
     while(i<num)
     {
        c = a+b;
        arr.add(c);
        a = b;
        b = c;
        i++;
     }
    return arr;
}
 
}
