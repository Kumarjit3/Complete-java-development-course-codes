import java.util.Map;
import java.util.HashMap;

public class MapHashMap 
{
    public static void main(String[] args)
    {
          Map<String,Integer> m1 = new HashMap<>();

          m1.put("Kumarjit",3);
          m1.put("Neil",1);
          m1.put("Mukesh",4);
          m1.put("Rana",5);
          m1.put("Niloy",6);
          m1.put("Karan",2);
          m1.put("Ibrahim",7);

          System.out.print("\n"+m1+"\n\n\n");

          for(String key : m1.keySet())
          {
              System.out.print(" "+key+" : "+m1.get(key)+"\n");
          }

           System.out.print("\n\n\n");
    }
}