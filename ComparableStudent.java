import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
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

    public int compareTo(Student that)
    {
       if(this.Roll > that.Roll)
       return 1;
       else
       return -1;
    }
}

public class ComparableStudent
{
   public static void main(String[] args)
   {

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

       Collections.sort(stud);

       System.out.print("\n");
       for(Student s1 : stud)
       {
            System.out.print("\n"+s1+"\n");
       }

   } 
}

