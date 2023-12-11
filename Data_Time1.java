import java.util.Date;

public class Data_Time1 
{
    public static void main(String[] args) 
    {
        Date date = new Date();

        System.out.print("\n"+date+"\n");

        long time=date.getTime();
        System.out.print("\n"+time+"\n");

        java.sql.Date sdate = new java.sql.Date(time);
        System.out.print("\n"+sdate+"\n");
    }
}
