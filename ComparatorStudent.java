import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int Roll;
    String Name;
    int Age;

    public Student(int Roll,String Name,int Age)
    {
        this.Roll=Roll;
        this.Name=Name;
        this.Age=Age;
    }

    public String toString()
    {
        return "Student->[ Name : "+Name+", Roll : "+Roll+", Age : "+Age+" ]";
    }
}

public class ComparatorStudent 
{
   public static void main(String[] args)
   {

       Comparator<Student> sum = new Comparator<Student>() 
       {
           public int compare(Student i,Student j)
           {
               if(i.Roll > j.Roll)
               return 1;
               else
               return -1;
           }
       };


       List<Student> stud = new ArrayList<>();

       stud.add(new Student(6,"Varun",19));
       stud.add(new Student(1,"Neil",20));
       stud.add(new Student(5,"Rihan",20));
       stud.add(new Student(7,"Niloy",20));
       stud.add(new Student(3,"Kumar",20));
       stud.add(new Student(2,"Ravi",19));
       stud.add(new Student(4,"Renu",19));

       System.out.print("\n");
       for(Student s1 : stud)
       {
            System.out.print("\n"+s1+"\n");
       }

       Collections.sort(stud,sum);

       System.out.print("\n");
       for(Student s1 : stud)
       {
            System.out.print("\n"+s1+"\n");
       }

   } 
}
