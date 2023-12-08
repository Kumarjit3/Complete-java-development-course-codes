import java.util.Scanner;
import ArrayOfObjects.Student;

public class DArrayOfObjects 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Student srr[] = new Student[4];
        
        Student s1 = new Student("Ram Roy","X",12,16);
        Student s2 = new Student("Kumarjit Mongal","X",3,16);
        Student s3 = new Student("Neil Roy","X",2,16);
        Student s4 = new Student("Niloy Chaterjee","X",1,16);
        
        srr[0] = s1;
        srr[1] = s2;
        srr[2] = s3;
        srr[3] = s4;

        int index=1;
        System.out.print("\nThe Object Details Are : \n");
        for(int i=0; i<3; i++)
        {
           System.out.print("\n"+(index++)+".No Student's Details Are Given Bellow: \n"); 
           System.out.print("\n "+srr[i].getName()+" ");
           System.out.print("\n "+srr[i].getClass1()+" ");
           System.out.print("\n "+srr[i].getRoll()+" ");
           System.out.print("\n "+srr[i].getAge()+" \n");
        }

        System.out.print("\n\n\n");
        input.close();
    }
}
