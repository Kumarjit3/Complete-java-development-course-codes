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

    public void show() {
    }
}

class Student
{
    public void sleep()
     {
        System.out.print("\nStudents Always Sleep Too Much\n");
     }
}



public class GenericsUpperBound 
{
    public static void main(String[] args)
    {
        ArrayList<Human> humanList = new ArrayList<>();
        ArrayList<Employee> employeList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Object> objectList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

         ArrayList<? extends Human> upperList = new ArrayList<>();

        humanList.add(new Human());
        employeList.add(new Employee());
        studentList.add(new Student());
        objectList.add(new Object());
        stringList.add(new String());

        //UpperBound Example ----->
        upperList = humanList;  
        upperList = employeList;

        //UpperBound Example ----->
        invokeForSleep(humanList);
        invokeForSleep(upperList);
        invokeForSleep(employeList);

        //errors ----->
        //upperList = studentList;  
        //upperList = objectList; 
        //upperList = stringList;

        //errors ----->
        //invokeForSleep(stringList);
        //invokeForSleep(studentList);
        //invokeForSleep(objectList);

        System.out.print("\n\n");

    }

   public static void invokeForSleep(List<? extends Human> list)
   {
        for(Human hh : list)
        {
            hh.sleep();
        }
   }
}
