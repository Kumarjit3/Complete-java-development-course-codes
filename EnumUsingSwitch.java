import java.util.Scanner;

enum WeekDay
{
   Monday,Tuesday,Wednessday,Thursday,Friday,Saturday,Sunday;
}

public class EnumUsingSwitch 
{
     static int getDayNumber(String s1)
     {
        s1=s1.toLowerCase();
       
        if(s1.equals("monday"))
        return 0;
        else if(s1.equals("tuesday"))
        return 1;
        else if(s1.equals("wednessday"))
        return 2;
        else if(s1.equals("thursday"))
        return 3;
        else if(s1.equals("friday"))
        return 4;
        else if(s1.equals("saturday"))
        return 5;
        else
        return 6;
     }
     
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Any One WeekDay Name : ");
        String input1 = sc.nextLine();

        int dayNo = getDayNumber(input1);

       /*  int i=0,fixed=0;
         for(WeekDay w1 : WeekDay.values())  //Not necessary
        {
            if(i == dayNo)
            {
               fixed = i;
            }
            else
            i++;
        }*/


        switch(dayNo) 
        {
            case 0:
            {
                System.out.print("\nHello its Monday\n");
                break;
            }
            case 1:
            {
                System.out.print("\nHello its Tuesday\n");
                break;
            } 
            case 2:
            {
                System.out.print("\nHello its Wednessday\n");
                break;
            }
            case 3:
            {
                System.out.print("\nHello its Thursday\n");
                break;
            }
            case 4:
            {
                System.out.print("\nHello its Friday\n");
                break;
            }
            case 5:
            {
                System.out.print("\nHello its Saturday\n");
                break;
            }           
            default:
            {
                System.out.print("\nHello its Sunday\n");
                break;
            }
        }

        System.out.print("\n\n\n");
        sc.close();
    }
}
