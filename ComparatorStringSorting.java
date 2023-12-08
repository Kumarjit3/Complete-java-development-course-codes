import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorStringSorting 
{
    public static void main(String[] args)
    {

        Comparator<String> com = new Comparator<String>() 
        {
             public int compare(String i, String j)
             {
                if(i.length() > j.length())
                return 1;
                else
                return -1;
             }
        };

        List<String> str = new ArrayList<>();

        str.add("Ravi");
        str.add("Kumar");
        str.add("Chitra");
        str.add("Neil");
        str.add("Disha");
        str.add("Neil");
        str.add("Rihan");
        str.add("Krishav");
        str.add("Hyder");
        str.add("Sukesh");
        str.add("Anand");
        str.add("Sinhani");
        str.add("Mukund");
        str.add("Faruk");
        str.add("Bikram");
        str.add("Perna");
        str.add("Ruksha");
        str.add("Deepsikha");

         System.out.print("\nUnsorted String List : \n\n");
         System.out.print(" "+str+"\n");

        Collections.sort(str);

         System.out.print("\nSorted String List According To Latter : \n\n");
         for(String s1 : str)
         {
            System.out.print(" "+s1+"\n");
         }

         Collections.sort(str,com);

         System.out.print("\nSorted String List According To Length : \n\n");
         for(String s1 : str)
         {
            System.out.print(" "+s1+"\n");
         }
          System.out.print("\n\n\n");
    }    
}
