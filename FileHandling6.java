import java.io.*;

public class FileHandling6 
{
    public static void main(String[] args) throws IOException
    {
        String filePath = ("D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\java.txt");
        FileReader reader = null;
        BufferedReader BReader = null;
        try
         {
              System.out.print("\n\n");  
              File file = new File(filePath);
              reader = new FileReader(file);
              BReader = new BufferedReader(reader); //for speed or fastter way to store data

              String str = BReader.readLine();   
              while(str!=null)
              {
                 System.out.print(" "+str+"\n");
                 str = BReader.readLine();
              }           
                System.out.print("\n\n");  
         }

         catch(Exception e)
         {
            System.out.println("\nSome Problem\n");
         }

         finally
         {
           BReader.close(); 
         }
         
    }
}
