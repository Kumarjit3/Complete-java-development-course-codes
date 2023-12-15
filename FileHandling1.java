import java.io.*;

public class FileHandling1 
{
    public static void main(String[] args) 
    {
        String filePath = "D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\java.txt";
        String dirPath = "D:\\Kumarjit\\Complete Java Development Course\\IO Files(File Handling)\\Dir";
       try
       { 
          File file1 = new File(filePath);
        // System.out.println("\n"+file1.exists()+"\n");
        // System.out.println("\n"+file1.createNewFile()+"\n");
        // System.out.println("\n"+file1.exists()+"\n");
        System.out.println("\n"+file1.getPath()+"\n");
        System.out.println("\n"+file1.isDirectory()+"\n");
        System.out.println("\n"+file1.isFile()+"\n");
       }
       catch(Exception e)
       {
           System.out.println("\nSome Problem aries\n");
       }

        File dir = new File(dirPath);
       // dir.mkdir();
       // System.out.println("\n"+dir.exists()+"\n");
       System.out.println("\n"+dir.getPath()+"\n");
       System.out.println("\n"+dir.isDirectory()+"\n");
       System.out.println("\n"+dir.isFile()+"\n");

       File f2 = new File("D:\\Kumarjit\\Complete Java Development Course");
       String str[] = f2.list();
       int count=0;
       for(String name : str)
       {
           count++;
           System.out.print("\n"+name+"\n");
       }

       System.out.print("\nTotal number of files : "+count+"\n\n");

    }
}

