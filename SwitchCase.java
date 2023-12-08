import java.util.Scanner;

public class SwitchCase 
{
    public static void main(String[] args) 
    {
        int day;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter The Day Number :- ");
        day = input.nextInt();
        
        switch (day) 
        {
            case 1:
            {
                System.out.print("\nIt's Monday\n");
                break;
            }
            case 2:
            {   
                System.out.print("\nIt's Tuesday\n");
                break;
            }
            case 3:
            {
                System.out.print("\nIt's Wednesday\n");
                break;
            }
            case 4:
            {
                System.out.print("\nIt's Thursday\n");
                break;
            }
            case 5:
            {
                System.out.print("\nIt's Friday\n");
                break;
            }
            case 6:
            {
                System.out.print("\nIt's Saturday\n");
                break;
            } 
            case 7:
            {
                System.out.print("\nIt's Sunday\n");
                break;
            } 
            default:
            {
                System.out.print("\nWrong Input! Correct Your Given Day Number\n");
                break;
            }
        }
        
        System.out.print("\n\n\n");
        input.close();
    }
}
