import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass 
{
    public static void main(String[] args) 
    {
          List<String> nums = Arrays.asList("Kumar","Rihan","Neil","Manju","Niloy");  
        
          //1.First Way________________________
          Optional<String> s1 = nums.stream()
                          .filter(str -> str.contains("x"))
                          .findFirst();
                          
          System.out.println("\n"+s1.orElse("Not Found")+"\n");  
          
          //2.Second Way_________________________
          String s2 = nums.stream()
                          .filter(n -> n.contains("e"))
                          .findFirst()
                          .orElse("Not Found");

          System.out.println("\n"+s2+"\n");             
    }
}
