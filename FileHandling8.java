import java.io.*;

class Student implements Serializable
{
    private int Id;
    private String Name;
    private int Age;

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


public class FileHandling8 
{
    public static void main(String[] args) throws IOException
    {

        Student s1 = new Student(3, 20, "Kumarjit Mongal");
        s1.display();

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;

        try
        {
            System.out.print("\n\n");

            fos = new FileOutputStream("D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\Seri1.txt");
            bos = new BufferedOutputStream(fos);  //for speed or fastter way to store data
            oos = new ObjectOutputStream(bos);

            oos.writeObject(s1);
            System.out.print("\nDone Writng Object in file seri\n");

        }

        catch(Exception e)
        {
            System.out.print("\nSome Problems\n");
        }

        finally
        {
           oos.close();
           fos.close();
           bos.close();
        }
    }    
}
