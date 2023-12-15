import java.io.*;

public class FileHandling2 
{
    public static void main(String[] args) throws IOException 
    {
        String filePath = "D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\java.txt";

        FileWriter writer = null;

        try
        {
             File file1 = new File(filePath);
             writer = new FileWriter(file1,true);

             writer.write("Java");
             writer.write("\n");
             writer.write(65);
             writer.write("\n");
             writer.write(97);
             writer.write("\n");
             char ch[] = {'a','l','i','e','n'};
             writer.write(ch);
             writer.write("\n");

             writer.write("\n");
             writer.write("Kumarjit");
             writer.write("\n");
             writer.write("Neil");
             writer.write("\n");
             writer.write("Manju");
             writer.write("\n");
             writer.write("Niloy");
             writer.write("\n");
             writer.write("Rihan");
        }
        catch(Exception e)
        {
            System.out.print("\nSome Problem\n");
        }
        finally
        {
            writer.close();
        }
    }
}
