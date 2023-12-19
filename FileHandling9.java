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


public class FileHandling9
{
    public static void main(String[] args) 
    {

        //Student s1 = new Student(3, 20, "Kumarjit Mongal");
        //s1.display();

        try
        {
            System.out.println("Helllo\n");
            FileInputStream fis = new FileInputStream("D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\Seri1.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);  //just only enhance the performance of the programme means the speed
            ObjectInputStream ois = new ObjectInputStream(bis);

            Student st = (Student)ois.readObject();
            st.display();

            fis.close();
            ois.close();
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
        catch(ClassNotFoundException c)
        {
            c.printStackTrace();
            System.out.print("\nSome Problems3\n");
        }
    }    
}

