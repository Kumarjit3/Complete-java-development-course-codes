import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class SmallToCapitalUsingStream 
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Kumar","Neil","Rihan","Manju","Niloy");
        
        List<String> nam = names.stream()
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());
                                    
                                   
          System.out.print(nam); 
    } 
}
