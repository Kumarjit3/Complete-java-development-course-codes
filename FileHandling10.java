import java.io.*;

class Student implements Serializable
{
    private int Id;
    private String Name;
   transient private int Age;

    public Student(int Id,int Age,String Name) 
    {
        super();
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
    }
   
    public void display()
    {
        System.out.print("\nId : "+this.Id);
        System.out.print("\nName : "+this.Name);
        System.out.print("\nAge : "+this.Age+"\n");
    }    
}


public class FileHandling10
{
    public static void main(String[] args) throws IOException
    {

       // try
       // {
       //     //D:\Kumarjit\Complete Java Development Course\IO Files(File Handling)
       //     System.out.println("Helllo\n");
       //     FileOutputStream fos = new FileOutputStream("D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\Seri.txt");
       //     BufferedOutputStream bos = new BufferedOutputStream(fos);  //just only enhance the performance of the programme means the speed
       //     ObjectOutputStream oos = new ObjectOutputStream(bos);
//
       //     Student s2 = new Student(3, 20, "Kumarjit Mongal");
       //     s2.display();
//
       //     oos.writeObject(s2);
       //     System.out.print("\nDone Writing\n");
//
       //     oos.close();
       //     fos.close();
       // }

       try
       {
              System.out.println("Helllo\n");
              FileInputStream fos = new FileInputStream("D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\Seri.txt");
              BufferedInputStream bos = new BufferedInputStream(fos);  //just only enhance the performance of the programme means the speed
              ObjectInputStream oos = new ObjectInputStream(bos);

              Student s1 = (Student)oos.readObject();
              s1.display();
       }

        catch(FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.print("\nSome Problems1\n");
        }
        catch(IOException i)
        {
            i.printStackTrace();
            System.out.print("\nSome Problems2\n");
        } 

        catch(Exception c)
        {
             c.printStackTrace();
            System.out.print("\nSome Problems3\n");
        }
    }

}