import java.io.*;

public class FileHandling7 
{
      public static void main(String[] args) throws IOException
      {
          String path = ("D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\java1.txt");
           File file1 = new File(path);
           FileWriter writer = null;
           PrintWriter pwriter = null;
          try 
          {
                 System.out.println(file1.exists());
                 file1.createNewFile();
                 System.out.println(file1.exists());
                 writer = new FileWriter(file1);
                 pwriter = new PrintWriter(writer);  //For write any data type text
                 
                 pwriter.println();
                 pwriter.print("Hello i am kumarjit");
                 pwriter.println();
                 pwriter.print("Java");
                 pwriter.println();
                 pwriter.print(97);
                 pwriter.println();
                 pwriter.print(65);
                 pwriter.println();
                 pwriter.print("Thank You");
                 pwriter.println();

          }

          catch(Exception e)
          {
             System.out.print("\nSome Problem\n");
          }

          finally
          {
              writer.close();
              pwriter.close();
          }
      }    
}
