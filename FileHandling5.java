import java.io.*;

public class FileHandling5 
{
    public static void main(String[] args) throws IOException
    {
        String filePath = ("D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\java.txt");
       
        FileWriter writer = null;
        BufferedWriter bWriter = null;

        try
         {
             File f1 = new File(filePath);
            writer = new FileWriter(f1,true);
            bWriter = new BufferedWriter(writer);   //for speed or fastter way to store data

            bWriter.newLine();
            bWriter.write("Alien");
            bWriter.newLine();
            bWriter.write(97);
            bWriter.newLine();
            bWriter.write(65);
            bWriter.newLine();
            char ch[] = {'J','A','V','A'};
            bWriter.write(ch);
            bWriter.newLine();
            
              System.out.println("\nOpen the java.txt file in your SSD\n");

         }

         catch(Exception e)
         {
             System.out.println("Some Problem\n\n");
         }

         finally
         {
             bWriter.flush();
             bWriter.close();
         }
    }
}
