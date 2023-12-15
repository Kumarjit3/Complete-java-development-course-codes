import java.io.*;

public class FileHandling4 
{
    public static void main(String[] args) throws IOException
    {
        String path = ("D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\java.txt");
        FileReader reader = null;

        try
        {
            File f1 = new File(path);
            reader = new FileReader(f1);
            char ch[] = new char[(int)f1.length()];
            reader.read(ch);

            for(char c:ch)
            {
                System.out.print(c+" ");
            }
        }

        catch(Exception e)
        {
            System.out.print("Some Problem\n");
        }

        finally
        {
            reader.close();
        }
    }
}
