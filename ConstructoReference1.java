import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class student1
{
    String Name;
    int Age;

    public student1()
    {
      Name="\0";
      Age = 0;
    }

    public student1(String Name)
    {
        this.Name = Name;
    }
}

public class ConstructoReference1 
{ 
  public static void main(String[] args)
  {
      List<String> names = Arrays.asList("Kumar","Manju","Mahi","Neil","Niloy");

      List<student1> std = new ArrayList<>();

      //way 1 to do that
      for(String num : names)
      {
         std.add(new student1(num));
      }      

      //way 2 to do that
      std = names.stream()
                 .map(n -> new student1(n))
                 .collect(Collectors.toList());

      //way 3 to do that           
      std = names.stream()
                 .map(student1::new)  //That is constructor reference
                 .collect(Collectors.toList());           

  }  

}
