import java.util.ArrayList;
import java.util.List;

class Human
{
     public void sleep()
     {
        System.out.print("\nHumans Have To Sleep Minimum Six Hour\n");
     }
}

class Employee extends Human
{
     public void sleep()
     {
        System.out.print("\nEmployes Wants To Sleep More\n");
     }
}

class Student
{
    public void sleep()
     {
        System.out.print("\nStudents Always Sleep Too Much\n");
     }
}



public class GenericsLowerBound 
{
    public static void main(String[] args)
    {
        System.out.print("\n\n");

        ArrayList<Human> humanList = new ArrayList<>();
        ArrayList<Employee> employeList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Object> objectList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

         ArrayList<? super Human> upperList = new ArrayList<>();

        humanList.add(new Human());
        employeList.add(new Employee());
        studentList.add(new Student());
        objectList.add(new Object());
        stringList.add(new String());
        upperList.add(new Human());

        //LowerBound Example ----->
         upperList = humanList; 
         upperList = objectList;  

        //LowerBound Example ----->
        invokeForSleep(humanList);
        invokeForSleep(upperList);
        invokeForSleep(objectList);


        //errors ----->
        //upperList = employeList;
        //upperList = studentList;  
        //upperList = stringList;

        //errors ----->
        //invokeForSleep(employeList);
        //invokeForSleep(stringList);
        //invokeForSleep(studentList);
    
        System.out.print("\n\n");

    }

   public static void invokeForSleep(List<? super Human> list)
   {
        for(Object hh : list)
        {
            System.out.print("Object can not sleep : "+hh.getClass()+"\n\n");
        }
   }
}

