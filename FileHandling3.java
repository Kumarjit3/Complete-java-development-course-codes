import java.io.FileReader;
import java.io.IOException;

public class FileHandling3 
{
    public static void main(String[] args) throws IOException
    {
        String filePath =("D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\java.txt");
        FileReader reader = null;

        try
        {
            reader = new FileReader(filePath);

            int i = reader.read();
          //  System.out.print("\n"+i+" => ");
          //  System.out.print((char)i);

            while(i != -1)
            {
                System.out.print("\n"+i+" => ");
                System.out.print((char)i);
                i = reader.read();
            }
        }

        catch(Exception e)
        {
             System.out.print("\nSome Problems are there\n");
        }

        finally
        {
            reader.close();
        }
    }
}
