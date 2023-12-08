import java.lang.String;

public class StringBasic 
{
    public static void main(String[] args) 
    {
        System.out.println("\n");
        String s1 = "KUMARJIT Mongal";
        String s2 = new String();
        System.out.println("\nThe Length Of The String Is : "+s1.length()+"\n");
        System.out.println("\nThe Length Of The String Is : "+s2.length()+"\n");
        System.err.println("\nString S1 5th Index Value : "+s1.charAt(5)+"\n");
        System.err.println("\nSubstring From S1 String : "+s1.substring(9, 15)+"\n");
        System.out.println("\nIs S1 Is Equals To S2 : "+s1.equals(s2)+"\n");
        System.err.println("\nIs S2 Is Empty : "+s2.isEmpty());
        System.err.println("\nS1 String In UpperCase : "+s1.toUpperCase()+"\n");
        System.out.println("After Triming S1 String : "+s1.trim()+"\n");

        System.out.println("\n");
    }
}
